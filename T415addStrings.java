package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 15:37
 * 力扣 415 字符串相加 简单
 * 2024/12/20 16:25
 */
public class T415addStrings {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1,num2));
    }
    public static String addStrings(String num1,String num2){
        int n1 = num1.length();
        int n2 = num2.length();
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        StringBuffer buffer = new StringBuffer();
        int temp = 0;
        while (n1>0||n2>0){
            int count1 = n1>0?chars1[--n1]-'0':0;
            int count2 = n2>0?chars2[--n2]-'0':0;
            int sum = count1+count2+temp;
            buffer.append(sum%10);
            temp = sum/10;
        }
        if (temp!=0){
            buffer.append(temp);
        }
        buffer.reverse();
        return new String(buffer);
    }
}
