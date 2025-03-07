package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/29 19:03
 * 力扣260 只出现一次的数字III 中等
 * 2024/11/29 19:11
 */
public class T260singleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] res = singleNumber(nums);
        for (int i = 0; i < 2; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] singleNumber(int[] nums){
        if(nums.length==2){
            return nums;
        }
        int[] res = new int[2];
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-1;i+=2){
            if (nums[i]!=nums[i+1]){
                res[count++] = nums[i];
                i--;
                if (count==2){
                    return res;
                }
            }
        }
        if (count==1){
            res[1] = nums[nums.length-1];
        }
        return res;
    }
}
