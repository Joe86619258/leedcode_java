package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/12 11:34
 * 力扣 643 子数组最大平均数I 简单
 * 2025/1/12 11:42
 */
public class T643findMaxAverage {
    public static void main(String[] args) {
        int[] ints = { 5 };
        int k = 1;
        System.out.println(findMaxAverage(ints, k));
    }

    public static double findMaxAverage(int[] ints, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += ints[i];
        }
        int maxSum = sum;
        int n = ints.length;
        for (int i = 0; i < n-k; i++) {
            sum -= ints[i];
            sum+=ints[k+i];
            maxSum = Math.max(maxSum,sum);
        }
        return 1.0*maxSum/k;
    }
}
