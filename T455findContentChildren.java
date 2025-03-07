package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/24 19:54
 * 力扣 455 分发饼干 简单
 * 2025/01/11 20:09
 */
public class T455findContentChildren {
    public static void main(String[] args) {
        int[] g = { 1, 2, 3 };
        int[] s = { 1, 1 };
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int m = g.length;
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0, j = 0; i < m && j < n; i++, j++) {
            while (j < n && g[i] > s[j]) {
                j++;
            }
            if (j < n && g[i] <= s[j]) {
                count++;
            }
        }
        return count;
    }
}
