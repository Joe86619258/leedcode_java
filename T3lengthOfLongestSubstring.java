package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/15 15:59
 * 力扣 第3题 无重复字符的最长字串 中等
 * 2024/11/15 16：29
 */
public class T3lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i))!=-1){
                max = Math.max(max, str.length());
                str = str.substring(str.indexOf(s.charAt(i))+1);
            }
            str+=s.charAt(i);
        }
        max = Math.max(max, str.length());
        return max;
    }
}
