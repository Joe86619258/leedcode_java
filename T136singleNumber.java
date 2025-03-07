package havaFinished;

import java.util.Arrays;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣136题  :  只出现一次的数字
 * 2024-10-21
 * 22:04
 */
public class T136singleNumber {
    public static void main(String[] args) {
        int[] ints = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(ints));
    }
    public static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }else{
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i==0 && nums[i]!= nums[i+1]){
                    return nums[i];
                }else if (i==nums.length-1 && nums[i]!= nums[i-1]){
                    return nums[i];
                }else if (nums[i]!= nums[i+1] && nums[i]!= nums[i-1]){
                    return nums[i];
                }
            }
            return 0;
        }
    }

//    2.
//    public static int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        int temp = nums[0];
//        int count = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != temp && count == 1) {  //如果当前数与上一个数字不同，且上一个数字出现的次数为一则其为目标数字
//                return temp;
//            } else if (nums[i] != temp && count != 1) {  //如果当前数与上一个数字不同，且上一个数字出现的次数不为一则将其出现次数置为1，并且将当前数字赋值给temp
//                count=1;
//                temp = nums[i];
//            }else{    //如果当前数与上一个数字相同，则将其出现次数加1
//                count++;
//            }
//        }
//            return nums[nums.length-1];
//        }
    }
