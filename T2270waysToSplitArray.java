package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/13 22:10
 * 力扣 2270 分割数组的方案数 中等
 * 2025/1/13 22:29
 */
public class T2270waysToSplitArray {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 0 };
        System.out.println(waysToSplitArray(nums));
    }

    public static int waysToSplitArray(int[] nums) {
        long left = 0;
        long sum = 0;
        for (int i : nums) {
            sum += i;
        }
        long avg;
        if (sum >= 0) {
            avg = sum / 2 + sum % 2;
        } else {
            avg = sum / 2;
        }
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            left += nums[i];
            if (left >= avg) {
                res++;
            }
        }
        return res;
    }
}
