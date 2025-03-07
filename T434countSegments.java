package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/24 15:33
 * 力扣 434 字符串中的单词数 简单
 * 2024/12/24 19:32
 *
 * 方法一：
 *      1.创建一个负责计数的参数
 *      2.遍历字符串，如果第一位不是空字符，则res+1
 *      3.从字符串第二位开始，如果该位置不为空且前一位为空，则该位置是一个单词的开始，res++
 *
 *  方法二：
 *      1.先取出字符串首尾空字符
 *      2.判断字符串是否为空字符串，若为空字符串则直接返回0
 *      3.\\s+表示包含一个或多个空字符
 *      4.用split将字符串按空格分开，最后计算数组大小
 */
public class T434countSegments {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
    public static int countSegments(String s){
        //方法一
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                res++;
            }
        }
        return res;

//        方法2，用split
//        if (s == null || s.isEmpty()) {
//            return 0;
//        }
//        s= s.trim();
//        //包含一个或多个空格
//        String[] s1 = s.split("\\s+");
//        return s1.length;
    }
}
