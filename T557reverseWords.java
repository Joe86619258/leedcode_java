package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣557题  :  反转字符串中的单词 III
 * 2024-11-6 13:42
 */
public class T557reverseWords {
    public static void main(String[] args) {
        String s = "  Let's take LeetCode contest  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] s1 = s.split("\\s+");  //以空格分割字符串
        String temp;
        for (int i = 0; i < s1.length; i++) {
            s1[i] = new StringBuilder(s1[i]).reverse().toString();
        }
        return String.join(" ",s1);
    }
}
