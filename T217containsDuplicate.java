package havaFinished;

import java.util.Arrays;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣217 存在重复元素
 * 2024.10.28 17：36
 */
public class T217containsDuplicate {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
