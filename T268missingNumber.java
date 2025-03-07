package havaFinished;

import java.util.Arrays;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣268题  :  丢失的数字
 * 2024-10-21
 * 18:04
 */
public class T268missingNumber {
    public static void main(String[] args) {
        int[] nums= {0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int numLen = nums.length;
        int num = 0;
        while (num<numLen){
            if (num!= nums[num]) {
                return num;
            }
            num++;
        }
        return numLen;
    }
}
