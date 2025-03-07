package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/21 17:11
 * 力扣162 寻找峰值
 * 2024/11/21 17:17
 */
public class T162findPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums){
        if (nums.length==1){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i==0){
                if (nums[i]>nums[i+1]){
                    return i;
                }else{
                    continue;
                }
            } else if (i==nums.length-1) {
                if (nums[i]>nums[i-1]){
                    return i;
                }else{
                    continue;
                }
            }else{
                if (nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                    return i;
                }
            }
        }
        return -1;
    }
}
