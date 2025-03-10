package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 21:05
 * 力扣 485 最大连续1的个数 简单
 * 2024/12/20 21:09
 */
public class T485findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int max = 0;
        int count = 0;
        for (int i = 0;i< nums.length;i++){
            if (nums[i]==1){
                count++;
                max = Math.max(max,count);
            }else{
                count = 0;
            }
        }
        return max;
    }
}
