package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/11 10:01
 * 力扣 2717 半有序排列 简单
 * 2024/12/11 10:40
 */
public class T2717semiOrderedPermutation {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 3};
        System.out.println(semiOrderedPermutation(nums));
    }

    public static int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int first=0,end=0;
        for (int i = 0; i < n; i++) {
            if (nums[i]==1){
                first = i;
            }
            if (nums[i]==n){
                end = i;
            }
        }
        return first+n-1-end-(first>end?1:0);
    }

}
