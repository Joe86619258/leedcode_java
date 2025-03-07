package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/29 15:16
 * 力扣 665 非递减数列 中等
 * 2024/11/29 15:41
 */
public class T665checkPossibility {
    public static void main(String[] args) {
        int[] nums = {4,2,1};
        System.out.println(checkPossibility(nums));
    }
    public static boolean checkPossibility(int[] nums){
        int n = nums.length, cnt = 0;
        for (int i = 0; i < n - 1; ++i) {
            int x = nums[i], y = nums[i + 1];
            if (x > y) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                //进行双重判断以防是i值出错而不是i+1值出错
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;
    }
}
