package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/29 14:34
 * 力扣 2894 分类求和并作差 简单
 * 2024/11/29 14:41
 */
public class T2894differenceOfSums {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        System.out.println(differenceOfSums(n,m));
    }
    public static int differenceOfSums(int n , int m){
        //方法一：
//        int num1 = 0;//存放不能被整除的数
//        int num2 = 0;//存放能被整除的数
//        for (int i = 1; i <= n; i++) {
//            if (i%m!=0){
//                num1+=i;
//            }else{
//                num2+=i;
//            }
//        }
//        return num1-num2;

        //方法2,
        // n/m代表n被m整除完最大的整数,(n/m+1)表示1和最大整数的和，*m是因为每个数都是m的倍数，前面除掉的m要乘回去
        // 根据求和公式为[n*(n+1)]/2,公式可转化位[n / m * (n / m + 1)]/2，因为前面的求和公式中有加上num2的和，所以后面要减两倍的num2
        return n * (n + 1) / 2 - n / m * (n / m + 1) * m;

    }
}
