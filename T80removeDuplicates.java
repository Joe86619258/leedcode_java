package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/13 22:43
 * 力扣 80 删除有序数组中的重复项II 中等
 * 2025/1/13 23:00
 */
public class T80removeDuplicates {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int i = 0;
        int left = 0;
        int right = 1;
        while (right < n) {
            while (right < n && nums[left] == nums[right]) {
                right++;
            }
            i++;
            if (right - left >= 2) {
                i++;
            }
            left = right;
        }
        return i;
    }
}
