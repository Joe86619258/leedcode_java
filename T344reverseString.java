package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣344题  :  反转字符串
 * 2024-10-21
 * 22:57
 */
public class T344reverseString {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串数组:");
        char[] c = {'h','e','l','l','o'};
        reverseString(c);
//        System.out.println(reverseString(c));
    }

    public static void reverseString(char[] c) {
        char temp;
        for (int i = 0; i < c.length/2; i++) {
            temp = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = temp;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
