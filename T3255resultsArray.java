package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣3255 长度为k的子数组的能量值II
 * 2024.11.7 8:56
 */
public class T3255resultsArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,5};
        int k = 3;
        int[] result = resultsArray(nums,k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] resultsArray(int[] nums,int k){
        if (k==1){
            return nums;
        }
        int[] result = new int[nums.length-k+1];
        int temp = 0;
        int mistake = -1;
        for (int i = 0; i < nums.length-k+1; i++) {
            temp = nums[i];
            if(i>0&&result[i-1] != -1){
                temp = result[i-1];
                if (nums[i+k-1]>temp&&nums[i+k-1]-temp == 1){
                    result[i] = nums[i+k-1];
                }else{
                    mistake = i-1;
                    result[i] = -1;
                }
            }else{
                if (i<mistake){
                    result[i] = -1;
                    continue;
                }else{
                    for (int j = i+1; j < i+k; j++) {
                        if (nums[j]>temp&&nums[j]-temp == 1){
                            temp = nums[j];
                        }else{
                            mistake = j-1;
                            result[i] = -1;
                            break;
                        }
                        result[i] = temp;
                    }
                }
            }
        }
        return result;
    }
}
