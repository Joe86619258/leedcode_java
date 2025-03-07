package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣3254 长度为k的子数组的能量值I
 * 2024.11.6 13:20
 */
public class T3254resultsArray {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,3,2};
        int k = 2;
        int[] result = resultsArray(nums,k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] resultsArray(int[] nums,int k){
        if (k==1){
            return nums;
        }
        int[] result = new int[nums.length-k+1];
        int temp = 0;
        for (int i = 0; i < nums.length-k+1; i++) {
            temp = nums[i];
            for (int j = i+1; j < i+k; j++) {
                if (nums[j]>temp&&nums[j]-temp == 1){
                    temp = nums[j];
                }else{
                    result[i] = -1;
                    break;
                }
                result[i] = temp;
            }
        }
        return result;
    }
}
