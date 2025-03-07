package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/11 19:44
 * 力扣 461 汉明距离 简单
 * 2025.01.11 19:51
 */
public class T461hammingDistance {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x,y));
    }

    /**
     *
     *
     * @param x
     * @param y
     * @return int
     */
    public static int hammingDistance(int x,int y){
        return Integer.bitCount(x ^ y);
    }
}
