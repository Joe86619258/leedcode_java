package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/2/23 16:07
 * 力扣 2506 统计相似字符串对的数目 简单
 * 2025/2/23 16:17
 */
public class T2506similiarPairs {
    public static void main(String[] args) {
        String[] words = {"aabb","ab","ba"};
        System.out.println(similiarPairs(words));
    }
    public static int similiarPairs(String[] words){
        int length = words.length;
        int[][] ints = new int[length][26];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int n = words[i].charAt(j)-'a';
                ints[i][n] = 1;
            }
        }
        int n = 0;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if (Arrays.equals(ints[i],ints[j])){
                    n++;
                }
            }
        }
        return n;
    }
}
