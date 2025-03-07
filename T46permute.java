package havaFinished;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣第46题
 */
public class T46permute {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return output;
        }
        // 对数组进行排序，确保排列的顺序
        Arrays.sort(nums);
        backtrack(nums, output);
        int count = 1; //存放全排列已存放个数
        int sum = 1;    //存放全排列应当达到的个数

        for (int i = 2; i <= nums.length; i++) {
            sum *= i;
        }

        while (count != sum) {
            for (int i = nums.length - 1; i >= 1; i--) {
                //如果该位置的数字比前一个数字大,需要进行翻转
                if (nums[i] > nums[i - 1]) {
                    int temp;
                    //从最后一个数开始往前遍历找出第一个比需要调换的数字(nums[i-1])大的位置和数字,遍历到i位置结束,只执行一次变换
                    for (int j = nums.length - 1; j > i - 1; j--) {
                        if (nums[j] > nums[i - 1]) {
                            temp = nums[i - 1];
                            nums[i - 1] = nums[j];
                            nums[j] = temp;
                            break;
                        }
                    }

                    //每次进行翻转后，都需要将i位置即之后的数列进行顺序排序，使其变成最小的排列
                    for (int j = 0; j < nums.length - i - 1; j++) {
                        for (int k = i; k < nums.length - 1; k++) {
                            if (nums[k] > nums[k + 1]) {
                                temp = nums[k];
                                nums[k] = nums[k + 1];
                                nums[k + 1] = temp;
                            }
                        }
                    }
                    backtrack(nums, output);
                    count++;
                    i++;
                }
            }
        }

        return output;
    }

    public static void backtrack(int[] nums, List<List<Integer>> output) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        output.add(list);
    }
}
