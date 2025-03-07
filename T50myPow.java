package havaFinished;

import java.util.Scanner;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣第50题
 */
public class T50myPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入x:");
        double x = scanner.nextDouble();
        System.out.println("请输入n:");
        int n = scanner.nextInt();
        double output = myPow(x,n);
        System.out.printf("%5f",output);
        scanner.close();
    }
    public static double myPow(double x, int n) {
        if(n==0 ||x == 1.0){ //指数为0或者底数为1时，结果为1
            return 1.0;
        }else if(x == -1.0){//底数为-1时，结果为-1或者1
            if(n%2 == 0){
                return 1.0;
            }else{
                return -1.0;
            }
        } else{
            boolean isSimilar = x>0&&n<0;
            //当底部为正数，且指数为负数时，且指数大于53时，结果为0
            //当底部为正数，且指数为Integer.MIN_VALUE时，结果为0
            if ((isSimilar&&(Math.abs(n) > 53)) || n == Integer.MIN_VALUE){
                return 0.0;
            }else if(x<1&&x>0&&n==Integer.MAX_VALUE){  //当底部为正数且小于1时，指数为Integer.MAX_VALUE时，结果为0
                return 0.0;
            }
            return Math.pow(x,n);
        }
    }
}
