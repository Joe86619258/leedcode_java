package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/15 10:43
 * 力扣 3280 将日期转换为二进制表示 简单
 * 2024/12/15 10:50
 */
public class T3280convertDateToBinary {
    public static void main(String[] args) {
        String date = "2080-02-02";
        System.out.println(convertDateToBinary(date));
    }

    public static String convertDateToBinary(String date) {
        String[] strings = date.split("-");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = Integer.toBinaryString(Integer.parseInt(strings[i]));
//            String res = "";
//            int num = Integer.parseInt(strings[i]);
//            while (num != 0) {
//                res = num % 2 + res;
//                num /= 2;
//            }
//            strings[i] = res;
        }
        return String.join("-",strings);
    }
}
