package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣第31题
 * 123
 * 132
 * 213
 * 231
 * 312
 * 321
 * 最大的排列是逆序的
 * 从后往前遍历，当出现顺序时需要进行翻转
 */
public class T31nextPermutation {
    public static void main(String[] args) {
        int[] ints = {1,2,3};
        ints = nextPermutation(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public static int[] nextPermutation(int[] nums) {
        //判断是否已经反转
        boolean hasreverse = false;

        //从后往前遍历
        for (int i = nums.length-1; i >=1 ; i--) {
            //如果该位置的数字比前一个数字大,需要进行翻转
            if (nums[i] > nums[i-1]){
                int temp;
                //从最后一个数开始往前遍历找出第一个比需要调换的数字(nums[i-1])大的位置和数字,遍历到i位置结束
                for(int j = nums.length-1;j>i-1;j--){
                    if(nums[j]>nums[i-1]){
                        temp = nums[i-1];
                        nums[i-1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
                //每次进行翻转后，都需要将i位置即之后的数列进行顺序排序，使其变成最小的排列
                for (int j = 0; j < nums.length-i-1; j++) {
                    for (int k = i; k < nums.length-1; k++) {
                        if(nums[k] > nums[k+1]){
                            temp = nums[k];
                            nums[k] = nums[k+1];
                            nums[k+1] = temp;
                        }
                    }
                }
                hasreverse = true;
                break;
            }
        }
        //如果没有反转，说明该数组已经是最大的排列，即需要将数列进行反转，输出最小数
        if(!hasreverse){
            for(int i = 0;i<nums.length/2;i++){
                int temp = nums[i];
                nums[i] = nums[nums.length-i-1];
                nums[nums.length-i-1]=temp;
            }
        }
        return nums;
    }
}
