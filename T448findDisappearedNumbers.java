package havaFinished;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 19:05
 * 力扣 448 找到所有数组中消失的数字 简单
 * 2024.12.20 19:37
 */
public class T448findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        List<Integer> list = findDisappearedNumbers(nums);
        for (int i : list) {
            System.out.println(i);
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] ints = new int[n];
        for (int i : nums) {
            ints[i-1]++;
        }
        for (int i = 0; i < n; i++) {
            if (ints[i]==0){
                list.add(i+1);
            }
        }
        return list;
    }
}
