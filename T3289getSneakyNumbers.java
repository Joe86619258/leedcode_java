package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/18 11:21
 * 力扣 3289 数字小镇中的捣蛋鬼 简单
 * 2024/12/18 11:27
 */
public class T3289getSneakyNumbers {
    public static void main(String[] args) {
        int[] nums = {0,3,2,1,3,2};
        int[] res = getSneakyNumbers(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] getSneakyNumbers(int[] nums){
        int[] ints = new int[2];
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                ints[count++] = nums[i++];
            }
            if (count==2){
                return ints;
            }
        }
        return ints;
    }
}
