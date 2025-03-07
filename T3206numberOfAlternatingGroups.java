package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/28 09:55
 * 力扣 3206 交替组I 简单
 * 2024/11/28 10:03
 */
public class T3206numberOfAlternatingGroups {
    public static void main(String[] args) {
        int[] colors = {0,1,0,0,1};
        System.out.println(numberOfAlternatingGroups(colors));
    }

    public static int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;
        int j;
        int k;
        for (int i = 0; i < n; i++) {
            j = i - 1 >= 0 ? i - 1 : n - 1;
            k = i + 1 < n ? i + 1 : 0;
            if (colors[j]==colors[k]&&colors[j]!=colors[i]){
                count++;
            }
        }
        return count;
    }
}
