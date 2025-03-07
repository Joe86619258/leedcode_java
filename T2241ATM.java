package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/5 12:11
 * 力扣 2241 设计一个ATM机器 中等
 * 2025/1/5 12:38
 */
public class T2241ATM {
    private int[] val;
    private long[] count;

    public T2241ATM() {
        val= new int[]{ 20, 50, 100, 200, 500 };
        count = new long[5];
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            count[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] ints = new int[5];
        for (int i = 4; i >= 0  ; i--) {
            ints[i] = (int) Math.min(count[i], amount / val[i]);
            amount -= ints[i] * val[i];
            if(amount==0){
                break;
            }
        }
        if (amount!=0){
            return new int[]{-1};
        }else{
            for (int i = 0; i < 5; i++) {
                count[i] -= ints[i];
            }
            return ints;
        }
    }

    public static void main(String[] args) {
        T2241ATM atm = new T2241ATM();
        atm.deposit(new int[]{ 0, 0, 1, 2, 1 });
        int[] res = atm.withdraw(600);
    }
}
