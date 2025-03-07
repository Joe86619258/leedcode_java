package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/29 16:16
 * 力扣 844 比较含退格的字符串 简单
 * 2024/11/29 16:50
 */
public class T844backspaceCompare {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public static String build(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i)!='#'){
                stringBuffer.append(s.charAt(i));
            }else{
                if (stringBuffer.length()>0){
                    stringBuffer.deleteCharAt(stringBuffer.length()-1);
                }
            }
        }
        return stringBuffer.toString();
    }
}
