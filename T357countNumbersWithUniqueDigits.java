package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 中等
 * 力扣 357. 统计各位数字都不相同的数字个数
 * 2024.10.26 19:11
 */
public class T357countNumbersWithUniqueDigits {
    public static void main(String[] args) {
        int n =2;
        System.out.println(countNumbersWithUniqueDigits(n));
    }
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10;
        }
        int count = 10;
        while(n>=2){
            int cur = 9;
            for (int i = 0; i < n - 1; i++) {
                cur *= 9 - i;
            }
            count+=cur;
            n--;
        }
        return count;
    }
}
