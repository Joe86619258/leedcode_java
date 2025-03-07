package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/2 18:53
 * 力扣345 反转字符串中的元音字母 简单
 * 2024/12/2 19:03
 */
public class T345reverseVowels {
    public static void main(String[] args) {
        String s= "IceCreAm";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s){
        int n = s.length();
        int i = 0;
        int j = s.length()-1;
        char[] chars = s.toCharArray();
        while (i<j){
            while (i<n&&!isVowel(chars[i])){
                i++;
            }
            while (j>0&&!isVowel(chars[j])){
                j--;
            }
            if (i<j){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }
}
