package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/29 14:22
 * 力扣 2716 最小化字符串长度 简单
 * 2024/11/29 14:28
 */
public class T2716minimizedStringLength {
    public static void main(String[] args) {
        String s = "dddaaa";
        System.out.println(minimizedStringLength(s));
    }
    public static int minimizedStringLength(String s){
        int[] ints = new int[26];
        Arrays.fill(ints,0);
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ints[s.charAt(i)-'a']==0){
                res++;
                ints[s.charAt(i)-'a']++;
            }
        }
        return res;
    }
}
