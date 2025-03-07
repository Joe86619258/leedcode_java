package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/29 18:41
 * 力扣238 除自身以外数组的乘积 中等
 * 2024/11/29 18:59
 */
public class T238productExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
    }
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];
        int sum = 1;
        int countZero = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i]==0){
                countZero++;
                j = i;
                if (countZero>1){
                    Arrays.fill(answer,0);
                    return answer;
                }
            }
            else{
                sum*=nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (countZero==1){
                Arrays.fill(answer,0);
                answer[j] = sum;
                return answer;
            }else{
                answer[i] = sum/nums[i];
            }
        }
        return answer;
    }
}
