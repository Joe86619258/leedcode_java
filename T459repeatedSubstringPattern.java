package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 20:03
 * 力扣 459 重复的子字符串 简单
 * 2024.12.20 20:21
 */
public class T459repeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && n % (i + 1) == 0) {
                if (check(i, s)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean check(int i, String s) {
        int n = s.length();
        int amount = n / (i + 1);
        String s1 = s.substring(0, i + 1);
        for (int j = 1; j < amount; j++) {
            String s2 = s.substring(j*(i+1),(j+1)*(i+1));
            if (!s1.equals(s2)){
                return false;
            }
        }
        return true;
    }
}
