package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣2119题  :  反转两次的数字
 * 2024.10.25 19:08
 */
public class T2119isSameAfterReversals {
    public static void main(String[] args) {
        int num = 1800;
        System.out.println(isSameAfterReversals(num));
    }
    public static boolean isSameAfterReversals(int num) {
        if(num == 0){
            return true;
        }else{
            return num%10!= 0;
        }
    }
}
