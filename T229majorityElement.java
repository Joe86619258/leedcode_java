package havaFinished;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/22 16:20
 * 力扣229 多数元素II 中等
 * 2024/11/22 16:31
 */
public class T229majorityElement {
    public static void main(String[] args) {
        int[] nums= {3,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length/3;
        Arrays.sort(nums);
        int mount = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i==nums.length-1||nums[i+1]!=nums[i]){
                if (mount>n){
                    list.add(nums[i]);
                }
                mount=1;
            }else{
                mount++;
            }
        }
        return list;
    }
}
