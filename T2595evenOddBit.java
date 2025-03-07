package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/2/23 16:23
 * 力扣 2595 奇偶位数 简单
 * 2025/2/23 16:40
 */
public class T2595evenOddBit {
    public static void main(String[] args) {
        int n = 50;
        int[] ints = evenOddBit(n);
        for (int i = 0; i < 2; i++) {
            System.out.println(ints[i]);
        }
    }
    public static int[] evenOddBit(int n){
        String s = Integer.toBinaryString(n);
        int length = s.length();
        int even= 0;
        int odd = 0;
        for (int i = length-1; i>=0; i--) {
            if (s.charAt(i)=='1'){
                if((length-i-1)%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        return new int[]{ even, odd };
    }
}
