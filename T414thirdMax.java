package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 15:18
 * 力扣 414 第三大的数 简单
 * 2024/12/20 15:30
 *
 * 解题思路
 *      1.先对源数组进行排序
 *      2.创建一个只含三位的数组
 *      3.进行从大到小循环，当ints填满数组时直接返回第三位元素
 *      4.若循环中没有返回，说明原数组大小小于3或不同元素数值小于3个，则直接返回最大值
 */
public class T414thirdMax {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums){
        int n = nums.length-1;
        Arrays.sort(nums);
        int count = 0;
        int[] ints = new int[3];
        for (int i=n;i>=0;i--){
            if (i==n){
                ints[count++] = nums[i];
            }else{
                if (ints[count-1]!=nums[i]){
                    ints[count++] = nums[i];
                }
            }
            if (count==3){
                return ints[2];
            }
        }
        return ints[0];
    }
}
