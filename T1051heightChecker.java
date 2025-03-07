package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/14 23:07
 * 力扣 1051 高度检查器 简单
 * 2025/1/14 23:10
 */
public class T1051heightChecker {
    public static void main(String[] args) {
        int[] height = {5,1,2,3,4};
        System.out.println(heightChecker(height));
    }
    public static int heightChecker(int[] height){
        int[] ints = height.clone();
        Arrays.sort(ints);
        int n = height.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ints[i]!=height[i]){
                res++;
            }
        }
        return res;
    }
}
