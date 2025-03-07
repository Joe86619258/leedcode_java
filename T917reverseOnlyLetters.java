package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣917题  :  仅仅反转字母
 * 2024.10.25 18:51
 *
 * 使用双指针
 * 1. 双指针分别指向字符串的首尾
 * 2. 左指针向右移动，直到遇到一个字母
 * 3. 右指针向左移动，直到遇到一个字母
 * 使用了StringBuilder类的setCharAt()方法来交换字母
 *      String没有该方法
 */
public class T917reverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s) {
        if (s.length() == 0){
            return s;
        }
        int i = 0, j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i<j){
            while(!Character.isLetter(s.charAt(i))&&i<j){
                i++;
            }
            while(!Character.isLetter(s.charAt(j))&&i<j){
                j--;
            }
            if(i<j){
                char temp = s.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}
