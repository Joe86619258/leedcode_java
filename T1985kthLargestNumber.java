package havaFinished;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/16 15:44
 * 力扣 1985 找出数组中的第K大整数 中等
 * 2025/1/16 15:53
 */
public class T1985kthLargestNumber {
    public static void main(String[] args) {
        String[] nums = {"3","4","7","10"};
        int k = 4;
        System.out.println(kthLargestNumber(nums,k));
    }
    public static String kthLargestNumber(String[] nums,int k){
        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length()!=b.length()){
                    return a.length()-b.length();
                }
                return a.compareTo(b);
            }
        });
        int n = nums.length;
        return nums[n-k];
    }
}
