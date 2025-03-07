package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣191题  :  位一的个数
 * 2024-10-21
 * 17:02
 */
public class T191hammingWeight {
    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        int n = 2147483645;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if (n%2 == 1){
                count++;
            }
            n = n/2;
        }
        return count;
    }
}
