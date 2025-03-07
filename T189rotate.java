package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/22 12:24
 * 力扣189 轮转数组
 * 2024/11/22 12:44
 */
public class T189rotate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] returnNum = rotate(nums, k);
        for (int i = 0; i < returnNum.length; i++) {
            System.out.print(returnNum[i] + " ");
        }
    }

    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[(i + k) % n] = nums[i];
        }
        return ints;
    }
}
