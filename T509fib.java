package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/16 23:23
 * 力扣 509 斐波那契数 简单
 * 2025/1/16 23:28
 */
public class T509fib {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if (n < 2) {
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
