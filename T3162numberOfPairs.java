package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/19 11:56
 * 力扣 3162 优质数对的总数I 简单
 * 2024/12/19 12:01
 */
public class T3162numberOfPairs {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4,12};
        int[] nums2 = {2,4};
        int k = 3;
        System.out.println(numberOfPairs(nums1,nums2,k));
    }
    public static int numberOfPairs(int[] nums1,int[] nums2,int k){
        int res = 0;
        for (int i : nums1) {
            for (int j :nums2) {
                j *= k;
                if (i%j == 0){
                    res++;
                }
            }
        }
        return res;
    }
}
