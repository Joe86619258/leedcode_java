package havaFinished;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/16 11:14
 * 力扣 973 最接近原点的K个点 中等
 * 2025/1/16 11:35
 */
public class T973kClosest {
    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        int[][] ints = kClosest(points,k);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i][0] + " " +ints[i][1]);
        }
    }
    public static int[][] kClosest(int[][] points,int k){
        //方法1
//        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> {
//            double d1 = Math.pow(a[0], 2) + Math.pow(a[1], 2);
//            double d2 = Math.pow(b[0], 2) + Math.pow(b[1], 2);
//            return (int) (d1 - d2);
//        });
//        for (int[] ints : points) {
//           queue.offer(ints);
//        }
//        int[][] res = new int[k][2];
//        for (int i = 0; i < k; i++) {
//            res[i] = queue.poll();
//        }
//        return res;

        //方法2
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
            }
        });
        return Arrays.copyOfRange(points, 0, k);
    }
}
