package havaFinished;

import java.util.PriorityQueue;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/14 12:43
 * 力扣 3066 超过阈值的最少操作数II 中等
 * 2025.01.14 12:54
 *
 * 知识点：
 *      PriorityQueue
 */
public class T3066minOperations {
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,9};
        int k = 20;
        System.out.println(minOperations(nums,k));
    }
    public static int minOperations(int[] nums,int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);
        for (int i :nums) {
            queue.offer(i);
        }
        int count = 0;
        while(queue.peek()<k){
            int x = queue.poll();
            int y = queue.poll();
            int sum =2*x+y;
            queue.offer(sum);
            count++;
        }
        return count;
    }
}
