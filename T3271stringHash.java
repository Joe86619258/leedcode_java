package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/18 11:49
 * 力扣 3271 哈希分割字符串 中等
 * 2024/12/18 12:05
 */
public class T3271stringHash {
    public static void main(String[] args) {
        String s = "mxz";
        int k = 3;
        System.out.println(stringHash(s,k));
    }
    public static String stringHash(String s ,int k){
        String result = "";
        int n = s.length();
        int sum;
        char c;
        for (int i = 0; i < n/k; i++) {
            sum = 0;
            for (int j = 0; j < k; j++) {
                c = s.charAt(i*k+j);
                sum += c-'a';
            }
            result += (char)('a'+sum%26);
        }
        return result;
    }
}
