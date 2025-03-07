package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣73题
 * 矩阵置零
 * 创建两个数组，分别记录行和列是否有0，如果有0则设置成true，最后进行行和列的变0操作
 * 若行有0，则在第一个行遍历中直接将该行全部变0，不会影响接下去的判断
 */
public class T73setZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length; //m行n列
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    row[i] = col[j] = true;
                }
            }
            //进行行变0操作
            if(row[i]) {
                for (int j = 0; j < col.length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        //进行列变0操作
        for (int i = 0; i < col.length; i++) {
            if(col[i]) {
                for (int j = 0; j < row.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
