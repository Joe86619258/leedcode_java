package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/16 22:58
 * 力扣 496 下一个更大元素I 简单
 * 2025/1/16 23:18
 */
public class T496nextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        int[] ints = nextGreaterElement(nums1,nums2);
        for (int i : ints) {
            System.out.println(i);
        }
    }
    public static int[] nextGreaterElement(int[] nums1,int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ints = new int[n1];
        Arrays.fill(ints,-1);
        for (int i = 0; i < n1; i++) {
            boolean hasNum = false;
            for (int j = 0; j < n2; j++) {
                if(nums1[i]==nums2[j]){
                    hasNum = true;
                    continue;
                }
                if (hasNum&&nums2[j]>nums1[i]){
                    ints[i] = j;
                    break;
                }
            }
        }
        return ints;
    }
}
