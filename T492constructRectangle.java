package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/11 20:13
 * 力扣 492 构造梯形 简单
 * 2025.01.11 20:19
 */
public class T492constructRectangle {
    public static void main(String[] args) {
        int area = 37;
        int[] ints = constructRectangle(area);
        for (int i :ints) {
            System.out.println(i);
        }

    }

    public static int[] constructRectangle(int area) {
        int n = (int) Math.sqrt(area);
        int res = 1;
        for (int i = 2; i <= n; i++) {
            if (area % i == 0) {
                res = i;
            }
        }
        return new int[]{area/res,res};
    }
}
