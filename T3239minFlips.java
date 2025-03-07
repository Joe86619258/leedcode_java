package havaFinished;

/**
 * @version 1.0
 * @Author: 娄时铭
 * @Date: 2024/11/15 15:01
 * 力扣 3239 中等
 * 最少反转次数使二进制矩阵回文I
 * 2024/11/15 15:12
 */
public class T3239minFlips {
    public static void main(String[] args) {
        int[][] grids = {{1,0,0},{0,0,0},{0,0,1}};
        System.out.println(minFlips(grids));
    }
    public static int minFlips(int[][] grids){
        int row = grids.length;
        int column = grids[0].length;
        int m = 0;
        int n = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0 , k = column-1; j <= k; j++,k--) {
                if (grids[i][j]!=grids[i][k]){
                    m++;
                }
            }
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0 , k = row-1; j <= k; j++,k--) {
                if (grids[j][i]!=grids[k][i]){
                    n++;
                }
            }
        }
        return Math.min(m,n);
    }
}
