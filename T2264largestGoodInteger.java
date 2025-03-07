package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/9 21:28
 * 力扣 2264 字符串中最大的3位相同数字 简单
 * 2025/1/9 22:51
 */
public class T2264largestGoodInteger {
    public static void main(String[] args) {
        String num = "2300019";
        System.out.println(largestGoodInteger(num));
    }
    public static String largestGoodInteger(String num){
        int n = num.length();
        int count = 1;
        String res = "";
        for (int i = 0; i < n-2; i++) {
            char c = num.charAt(i);
            if (!res.isEmpty()&&c<res.charAt(0)){
                continue;
            }
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                String current = num.substring(i, i + 3);
                if (res.compareTo(current) < 0) {
                    res = current;
                }
            }
        }
        return res;
    }
}
