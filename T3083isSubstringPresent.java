package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣3083题  :  字符串及其反转中是否存在同一子字符串
 * 2024.10.25 19:29
 */
public class T3083isSubstringPresent {
    public static void main(String[] args) {
        String s1 = "abcd";
        System.out.println(isSubstringPresent(s1));
    }
    public static boolean isSubstringPresent(String s1) {
        String string = new StringBuilder(s1).reverse().toString();
        String s;
        for (int i = 0; i < s1.length()-1; i++) {
            s = s1.substring(i,i+2);
            if(string.contains(s)){
                return true;
            }
        }
        return false;
    }
}
