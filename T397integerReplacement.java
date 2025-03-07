package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 14:23
 * 力扣 397 整数替换 中等
 * 2024/12/20 15:10
 *
 */
public class T397integerReplacement {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(integerReplacement(n));
    }
    public static int integerReplacement(int n){
        if (n == 1){
            return 0;
        }
        if (n%2 == 0){
            return 1 + integerReplacement(n/2);
        }
        return 2+Math.min(integerReplacement(n/2),integerReplacement(n/2+1));
    }
}
