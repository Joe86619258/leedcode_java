package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/12 11:11
 * 力扣 628 三个数的最大乘积 简单
 * 2025/1/12 11:26
 */
public class T628maximumProduct {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
//        if (n==3){
//            return nums[0]*nums[1]*nums[2];
//        }
//        if (nums[0]>0||nums[n-1]<0){ //当数组数字全为正数或全为复数，都要取最大数
//            return nums[n-1]*nums[n-2]*nums[n-3];
//        }
//        if (nums[0]*nums[1]<nums[n-2]*nums[n-3]){
//            return nums[n-1]*nums[n-2]*nums[n-3];
//        }else{
//            return nums[n-1]*nums[0]*nums[1];
//        }
    }
}
