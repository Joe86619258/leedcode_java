package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/17 11:49
 * 力扣 41 缺少的第一个正数 困难
 * 2025/1/17 11:56
 *
 */
public class T41firstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0]>1||nums[n-1]<1){
            return 1;
        }
        int res = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i]<1){
                continue;
            }
            if (nums[i]==res) {
                res++;
            }else{
                return res;
            }
        }
        return res;

//        方法2:
//        int len = nums.length;
//
//        Set<Integer> hashSet = new HashSet<>();
//        for (int num : nums) {
//            hashSet.add(num);
//        }
//
//        for (int i = 1; i <= len ; i++) {
//            if (!hashSet.contains(i)){
//                return i;
//            }
//        }
//
//        return len + 1;
    }
}
