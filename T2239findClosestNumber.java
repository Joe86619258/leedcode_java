package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/20 19:39
 * 力扣 2239 找到最接近0的数字 简单
 *
 */
public class T2239findClosestNumber {
    public static void main(String[] args) {
        int[] nums = {2,-1,1};
        System.out.println(findClosestNumber(nums));
    }
    public static int findClosestNumber(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0]>0){
            return nums[0];
        }else{
            for (int i = 0; i < n-1; i++) {
                if (nums[i]<0&&nums[i+1]>=0){
                    int n1 = Math.abs(nums[i]);
                    int n2 = Math.abs(nums[i+1]);
                    return n1<n2 ? nums[i] : nums[i+1];
                }
            }
            return nums[n-1];
        }

        //方法2：
//        int res = nums[0];   // 已遍历元素中绝对值最小且数值最大的元素
//        int dis = Math.abs(nums[0]);   // 已遍历元素的最小绝对值
//        for (int num : nums) {
//            if (Math.abs(num) < dis) {
//                dis = Math.abs(num);
//                res = num;
//            } else if (Math.abs(num) == dis) {
//                res = Math.max(res, num);
//            }
//        }
//        return res;
    }
}
