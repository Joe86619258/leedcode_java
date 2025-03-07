package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣3191题 使二进制数组全部等于1的最小操作次数
 * 2024.10.18 11:36
 */
public class T3191minOperations {
    public static void main(String[] args) {
        int[] num = {1,1,1};
        System.out.println(minOperations(num));
    }
    public static int minOperations(int[] nums) {
        int count = 0;
        if (nums.length<3){
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 0){
                    return -1;
                }
            }
        }
        for(int i=0;i<nums.length-2;i++){  //从数组第一个元素开始遍历,遍历到倒数第三个元素
            if(nums[i] == 0){ //如果当前元素为0，则将其变为1
                nums[i] = 1;
                int j = i+1;
                int k = i+2;
                if(nums[j] == 1){
                    nums[j] = 0;
                }else{
                    nums[j] = 1;
                }
                if(nums[k] == 1){
                    nums[k] = 0;
                }else{
                    nums[k] = 1;
                }
                count++;
            }
        }
        for (int i = nums.length-2; i < nums.length; i++) {
            if(nums[i] == 0){
                return -1;
            }
        }
        return count;
    }
}
