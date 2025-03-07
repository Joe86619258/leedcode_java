package havaFinished;

import java.util.Arrays;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣3194 最小平均差
 * 2024.10.16 8:46
 */
public class T3194minimumAverage {
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        double[] averages = new double[nums.length/2];
        Arrays.sort(nums);
        for (int i = 0 ,j = nums.length-1; i < j; i++,j--) {
            averages[i] = (nums[i]+nums[j])/2.0;
        }
        Arrays.sort(averages);
        System.out.println(averages[0]);
    }
}
