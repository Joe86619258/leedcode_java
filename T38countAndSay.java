package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣38题
 */
public class T38countAndSay {
    public static void main(String[] args) {
        int count = 4;
        String output = "1";
        for (int i = 1; i < count; i++) {
            String s = "";
            int n = 1;  //存储目前数字有几个相同
            for (int j = 0; j < output.length(); j++) {
                if (j < output.length() - 1 && output.charAt(j) == output.charAt(j + 1)) {
                    n++;
                } else {
                        s = s + n + output.charAt(j);
                        n = 1;
                }
            }
            output = s;
        }
        System.out.println(output);
    }
}
