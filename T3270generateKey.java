package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/18 12:14
 * 力扣 3270 求出数字答案 简单
 * 2024/12/18 12:34
 */
public class T3270generateKey {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        System.out.println(generateKey(num1,num2,num3));
    }
    public static int generateKey(int num1,int num2,int num3){
        int res = 0;
        int min;
        for (int i=0;num1>0&&num2>0&&num3>0;i++){
            min = Math.min(num1%10,num2%10);
            res+=Math.min(min,num3%10)*Math.pow(10,i);
            num1/=10;
            num2/=10;
            num3/=10;
        }
        return res;
    }
}
