package havaFinished;

import java.util.Arrays;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣137题  :  只出现一次的数字
 * 2024-10-26 13:17
 */
public class T137singleNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=3) {
            if (i<nums.length-1&&nums[i]!= nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
