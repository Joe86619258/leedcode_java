package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/19 11:24
 * 力扣 910 最小差值II 中等
 * 2024/12/19 11:38
 * 可回看
 *
 * 解题思路
 *      1.先对数列进行排序，取出最大值和最小值
 *      2.进行循环（题目说每个数组元素必须都要加k或-k）
 *          对于两数之差最小，最大值一定减k,最小值一定加k
 *          i从0开始到n-2为止，(若取到n-1,当数组大小为1时答案可能会出现错误)
 *
 *
 */
public class T910smallestRangeII {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        System.out.println(smallestRangeII(nums,k));
    }
    public static int smallestRangeII(int[] nums, int k){
        int n = nums.length;
        Arrays.sort(nums);
        int max = nums[n-1];
        int min = nums[0];
        int res = max - min;
        for (int i = 0; i < n-1; i++) {
            int big = nums[i+1]-k;
            int small = nums[i]+k;
            res = Math.min(res,Math.max(big,max-k)-Math.min(min+k,small));
        }
        return res;
    }
}
