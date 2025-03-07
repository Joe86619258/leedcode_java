package havaFinished;

import java.util.Arrays;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣 283. 移动零
 * 2024.10.30 9:54
 */
public class T283moveZeroes {
    public static void main(String[] args) {
        int[] nums= {0};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int count = 0 ; //当前存放位置
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        Arrays.fill(nums,count,nums.length,0);
//        Arrays.sort(nums,0,count);
    }
}
