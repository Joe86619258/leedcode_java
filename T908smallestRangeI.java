package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/19 11:11
 * 力扣 908 最小差值I 简单
 * 2024/12/19 11:16
 */
public class T908smallestRangeI {
    public static void main(String[] args) {
        int[] nums = {1,3,6};
        int k = 3;
        System.out.println(smallestRangeI(nums,k));
    }
    public static int smallestRangeI(int[] nums,int k){
//        int minNum = Arrays.stream(nums).min().getAsInt();
//        int maxNum = Arrays.stream(nums).max().getAsInt();
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-1]-nums[0]<=2*k?0:nums[n-1]-nums[0]-2*k;
    }
}
