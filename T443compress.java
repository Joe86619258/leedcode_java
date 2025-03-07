package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 17:11
 * 力扣 443 压缩字符串
 * 2024/12/20 19:01 中等
 */
public class T443compress {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars){
        int left = 0;
        int right = 1;
        int n = chars.length;
        if (n==1){
            return 1;
        }
        int count = 0;
        while(right<n){
            if (chars[left]!=chars[right]){
                chars[count++] = chars[left];
                int sum = right-left;
                if (sum>1){
                    String s = ""+sum;
                    int i = s.length();
                    for (int j = 0; j < i; j++) {
                        chars[count++] = s.charAt(j);
                    }
                }
                left = right;
            }
            right++;
        }
        if (right!=left){
            chars[count++] = chars[left];
            int sum = right-left;
            if (sum>1){
                String s = ""+sum;
                int i = s.length();
                for (int j = 0; j < i; j++) {
                    chars[count++] = s.charAt(j);
                }
            }
        }
        return count;
    }
}
