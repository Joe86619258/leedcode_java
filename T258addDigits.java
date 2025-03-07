package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣258题  :  各位相加
 * 2024-10-21
 * 17:44
 */
public class T258addDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {
        while(num>=10){
            int sum = 0;
            while(num!=0){
                sum+=num%10;
                num /=10;
            }
            num = sum ;
        }
        return num;
    }
}
