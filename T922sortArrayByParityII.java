package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/15 10:33
 * 力扣 922 按奇偶排序数组II 简单
 * 2024/12/15 10:39
 */
public class T922sortArrayByParityII {
    public static void main(String[] args) {
        int[] nums={2,3};
        int[] res=sortArrayByParityII(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] sortArrayByParityII(int[] nums){
        int n = nums.length;
        int[] ints = new int[n];
        int count1 = 1;//存放奇数
        int count2 = 0;//存放偶数
        for (int i = 0; i < n; i++) {
            if (nums[i]%2==0){
                ints[count2]=nums[i];
                count2+=2;
            }else{
                ints[count1]=nums[i];
                count1+=2;
            }
        }
        return ints;
    }
}
