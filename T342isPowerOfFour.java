package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 简单题
 * 力扣 342. 4的幂
 * 2024.10.26 20:24
 */
public class T342isPowerOfFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        if(n%4==0){
            return isPowerOfFour(n/4);
        }
        return false;
    }
}
