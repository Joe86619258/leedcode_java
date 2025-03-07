package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/12 12:15
 * 力扣 674 最长连续递增序列 简单
 * 2025/1/12 12:23
 */
public class T674findLengthOfLCIS {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        System.out.println(findLengthOfLCIS(nums));
    }
    public static int findLengthOfLCIS(int[] nums){
        int maxLen = 0;
        int left = 0;
        int right = 1;
        int n = nums.length;
        while(right<n){
            if (nums[right]<=nums[right-1]){
                maxLen = Math.max(maxLen,right-left);
                left = right;
            }
            right++;
        }
        return Math.max(maxLen,right-left);
    }
}
