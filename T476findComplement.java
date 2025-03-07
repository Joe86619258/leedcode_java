package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 20:52
 * 力扣 476 数字的补救 简单
 * 2024/12/20 20:59
 */
public class T476findComplement {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }
    public static int findComplement(int num){
        String s = Integer.toBinaryString(num);
        String res = "";
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)=='0'){
                res+="1";
            }else{
                res+="0";
            }
        }
        return Integer.parseInt(res,2);

//        int highbit = 0;
//        for (int i = 1; i <= 30; ++i) {
//            if (num >= 1 << i) {
//                highbit = i;
//            } else {
//                break;
//            }
//        }
//        int mask = highbit == 30 ? 0x7fffffff : (1 << (highbit + 1)) - 1;
//        return num ^ mask;
    }
}
