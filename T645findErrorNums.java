package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/12 12:03
 * 力扣 645 错误的集合 简单
 * 2025/1/12 12:12
 */
public class T645findErrorNums {
    public static void main(String[] args) {
        int[] nums = {1,1};
        int[] ints = findErrorNums(nums);
        for (int i :ints) {
            System.out.println(i);
        }
    }
    public static int[] findErrorNums(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int[] ints = new int[2];
        for (int i = 0; i < n-1; i++) {
            if (nums[0]!=1){
                ints[1] = 1;
            }
            if (nums[i]==nums[i+1]){
                ints[0] = nums[i];
            } else if (nums[i+1]!=nums[i]+1) {
                ints[1] = nums[i]+1;
            }
            if (ints[0]!=0&&ints[1]!=0){
                return ints;
            }
        }
        if (ints[1]==0){
            ints[1]=n;
        }
        return ints;
    }
}
