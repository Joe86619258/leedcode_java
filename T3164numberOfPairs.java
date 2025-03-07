package havaFinished;

import java.util.HashMap;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/19 12:10
 * 力扣 3164 优质数对的总数II 中等
 * 2024/12/19 12:17
 *
 * 解题思路
 *      1.先将nums1和nums2两个数组中的数组存放到两个hashmap中，并记录每个数出现的次数，max是nums1中最大的元素
 *      2.进行循环取出nums2中的每个元素，将其乘上k,对num1进行循环，看其中是否存在其倍数，若存在则取出map1中其次数乘上nums2中元素出现的次数并添加给res
 */
public class T3164numberOfPairs {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4,12};
        int[] nums2 = {2,4};
        int k = 3;
        System.out.println(numberOfPairs(nums1,nums2,k));
    }
    public static long numberOfPairs(int[] nums1, int[] nums2, int k) {
        long res = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int max = 0;
        for (int i : nums1) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
            max = Math.max(i,max);
        }
        for (int i :nums2) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }
        for (int i : map2.keySet()) {
            for (int j = i*k; j <= max; j+=i*k) {
                if (map1.containsKey(j)){
                    res+=1L*map1.get(j)*map2.get(i);
                }
            }
        }
        return res;
    }
}
