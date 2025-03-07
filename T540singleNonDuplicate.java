package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/15 15:20
 * 力扣 540 有序数组中的单一元素
 * 2024/11/15 15:25
 */
public class T540singleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0){
                sum+=nums[i];
            }else{
                sum-=nums[i];
            }
        }
        return Math.abs(sum);
    }
}
