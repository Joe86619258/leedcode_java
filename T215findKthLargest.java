package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/22 16:09
 * 力扣215 数组中的第k个最大元素 中等
 * 2024/11/22 16:12
 */
public class T215findKthLargest {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
