package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/13 14:41
 * 力扣 3264 K次乘运算后的最终数组I 简单
 * 2024/12/13 14:26
 */
public class T3264getFinalState {
    public int[] getFinalState(int[] nums, int k, int multiplier){
        for (int i = 0;i<k;i++){
            int l = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j]<nums[l]){
                    l = j;
                }
            }
            nums[l]*=multiplier;
        }
        return nums;
    }
}
