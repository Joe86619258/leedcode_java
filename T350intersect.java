package havaFinished;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/13 20:35
 * 力扣 350 两个数组的交集II 简单
 * 2024/12/13 21:02
 */
public class T350intersect {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ret = intersect(nums1,nums2);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }
    public static int[] intersect(int[] nums1,int[] nums2){
        if (nums1.length<nums2.length){
            intersect(nums2,nums1);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for (int i : nums1) {
            count = map.getOrDefault(i,0)+1;
            map.put(i,count);
        }
        int[] ints = new int[nums1.length];
        int index = 0;
        for (int i :nums2) {
            count = map.getOrDefault(i,0);
            if (count>0){
                if (count==1){
                    map.remove(i);
                }else{
                    map.put(i,count-1);
                }
                ints[index++] = i;
            }
        }
        return Arrays.copyOfRange(ints,0,index);
    }
}
