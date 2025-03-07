package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣67题
 * 二进制求和
 * 将两个二进制数反转，然后从低位开始相加，逢二进一，最后将结果反转
 */
public class T67addBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String a, String b) {
        int n = Math.max(a.length(), b.length());
        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();
        StringBuffer ans = new StringBuffer();
        int num1, num2, sum, temp = 0;
        for (int i = 0; i < n; i++) {
            num1 = a.length() > i ? a.charAt(i) - '0' : 0;
            num2 = b.length() > i ? b.charAt(i) - '0' : 0;
            sum = num1 + num2 + temp;
            ans.append(sum % 2);
            temp = sum / 2;
        }
        if(temp != 0){
            ans.append(temp);
        }
        return ans.reverse().toString();
    }
}
