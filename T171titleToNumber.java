package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 171. Excel 表列序号
 * 2024-10-26 14:06
 */
public class T171titleToNumber {
    public static void main(String[] args) {
        String columnTitle = "AAY";
        System.out.println(titleToNumber(columnTitle));
    }
    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        int temp;
        for (int i = 0; i < columnTitle.length(); i++) {
            temp = columnTitle.charAt(i) - 'A' + 1;
            sum = sum * 26 + temp;
        }
        return sum;
    }
}
