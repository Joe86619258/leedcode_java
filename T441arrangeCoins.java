package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/24 19:45
 * 力扣 441 排列硬币 简单
 * 2024/12/24 19:50
 */
public class T441arrangeCoins {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n ){
        int i = 1;
        while (n>=0){
            n-=i;
            i++;
        }
        return i-2;
    }
}
