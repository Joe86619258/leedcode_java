package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/14 22:58
 * 力扣 561 数组拆分 简单
 * 2025/1/14 23:01
 */
public class T561arrayPairSum {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i+=2) {
            sum +=nums[i];
        }
        return sum;
    }
}
