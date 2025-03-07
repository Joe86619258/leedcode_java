package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/22 18:33
 * 力扣 263 丑数 简单
 * 2024/11/22 18:37
 */
public class T263isUgly {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isUgly(n));
    }
    public static boolean isUgly(int n) {
        if (n<=0){
            return false;
        }
        int[] factors = {2,3,5};
        for (Integer i : factors) {
            while (n%i==0){
                n/=i;
            }
        }
        return n==1;
    }
}
