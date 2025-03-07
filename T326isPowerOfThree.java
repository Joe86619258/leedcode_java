package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣 326. 3的幂
 * 2024.10.26 20：:12
 */
public class T326isPowerOfThree {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (n % 3!= 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }
}
