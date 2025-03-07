package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣231题  :  2的幂
 * 2024-10-21
 * 17:28
 */
public class T231isPowerOfTwo {
    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n == 0){
            return false;
        }else if (n == 1){
            return true;
        }else{
            while (n!= 2) {
                if (n % 2!= 0) {
                    return false;
                }
                n = n / 2;
            }
            return true;
        }
    }
}
