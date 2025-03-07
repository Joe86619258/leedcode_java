package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣389 找不同
 *2024.10.16 15:29
 * 将t的ascii码相加，然后减去s的ascii码相加，得到的就是不同的字符
 */
public class T389findTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
    public static char findTheDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++){
            sum -= s.charAt(i);
        }
        return (char) sum;
    }
}
