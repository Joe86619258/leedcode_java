package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/22 19:46
 * 力扣 287 寻找重复数 中等
 * 2024/11/22 19:51
 */
public class T287findDuplicate {
    public static void main(String[] args) {
        int[] nums= {3,3,3,3,3};
        System.out.println(findDuplicate(nums));
//        findDuplicate(nums);
    }
    public static int findDuplicate(int[] nums) {
        int[] ints = new int[nums.length];
        System.arraycopy(nums,0,ints,0,nums.length);
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]==ints[i+1]){
                return ints[i];
            }
        }
        return 0;
    }
}
