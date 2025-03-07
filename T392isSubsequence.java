package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 简单题
 * 力扣392. 判断子序列
 * 2024.10.26 15:07
 */
public class T392isSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        if (s.length()>t.length()){return false;}
        int i = 0;
        int j = 0;
        while (i<s.length()&&j<t.length()){
            if (s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else {
                j++;
            }
        }
        if (i==s.length()){
            return true;
        }
        return false;
    }
}
