package havaFinished;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/3 13:39
 * 力扣 3159 查询数组中元素的出现位置 中等
 * 2025/1/3 14:00
 */
public class T3159occurrencesOfElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7};
        int[] queries = {10};
        int x = 5;
        int[] arr = occurrencesOfElement(nums, queries, x);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int count = 0;
        int m = nums.length;
        int n = queries.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (nums[i] == x) {
                list.add(i);
                count++;
            }
        }
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            int num = queries[i];
            if (num>count){
                ints[i] = -1;
            }else {
                ints[i] = list.get(num-1);
            }
        }
        return ints;
    }
}
