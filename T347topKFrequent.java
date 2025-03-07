package havaFinished;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/14 13:09
 * 力扣 347 前k个高频元素 中等
 * 2025/1/14 13:29
 */
public class T347topKFrequent {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 1;
        int[] res = topKFrequent(nums, k);
        for (int i : res) {
            System.out.println(i);
        }

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 1) {
            return new int[]{nums[0]};
        }
        int[] res = new int[k];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int left = 0;
        int right = 1;
        while (right < n) {
            while (right < n && nums[left] == nums[right]){
                right++;
            }
            queue.offer(new int[]{nums[left],right-left});
            left = right;
        }
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }
        return res;
    }
}
