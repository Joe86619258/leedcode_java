package havaFinished;

import java.util.Arrays;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣164题  :  最大间距
 */
public class T164maximumGap {
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));
    }
    public static int maximumGap(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1]-nums[i]>max){
                max = nums[i+1]-nums[i];
            }
        }
        return max;
    }
}
