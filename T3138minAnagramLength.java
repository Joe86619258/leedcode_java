package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 13:32
 * 力扣 3138 同位字符串连接的最小长度 中等
 * 2024/12/20 14:01
 *
 * 解题思路：
 *      1.进行循环，判断当前字符截取的长度是否能整除原始字符串的长度(若可以则进行下一步check判断)
 *      2.check中先判断当前的字符串是否是原始字符串，若是则直接返回true,否则进入下一步判断
 *      3.创建两个数组，ints存放截取的字符串各char字符出现的次数，循环，创建数组，存放原始字符串中长度与截取的字符串长度相同的字符串各字符出现的次数
 *      4.对两个数组进行比较，若相同，则返回true,输出i+1；否则返回false,重新进行第一步的截取
 */
public class T3138minAnagramLength {
    public static void main(String[] args) {
        String s = "aabbabab";
        System.out.println(minAnagramLength(s));
    }
    public static int minAnagramLength(String s){
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (n%(i+1)!=0){
                continue;
            }else{
                boolean isTrue = check(s,i);
                if (isTrue){
                    return i+1;
                }
            }
        }
        return n;
    }
    public static boolean check(String s,int i){
        int[] ints = new int[26];
        int n = s.length();
        int count = n/(i+1); //商
        if (count==1){
            return true;
        }
        for (int j = 0; j <= i; j++) {
            ints[s.charAt(j)-'a']++;
        }
        for (int j = 1;j<count;j++){
            int[] ints1 = new int[26];
            for (int k = 0; k <= i; k++) {
                ints1[s.charAt(j*(i+1)+k)-'a']++;
            }
            if (!Arrays.equals(ints, ints1)){
                return false;
            }
        }
        return true;
    }
}
