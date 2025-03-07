package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/2 17:19
 * 力扣 221 最大正方形 中等
 * 2024/12/2 17:49
 * 1.先对原始数组进行判断，若为空或者只有一个字符为0时直接返回0
 * 2.进行数组的循环，当出现1时，将最大的正方形的边长与1进行比较
 *      进行内部的循环：
 *          对斜对角的字符进行判断，若为0则直接跳出内层循环
 *          对新增的行和列进行判读是否全为1，若全为1则将目前的正方形边长与已记录最大正方形边长进行比较
 * 3.返回最大边长的乘积表示正方形的面积
 */
public class T221maximalSquare {
    public static void main(String[] args) {
        char[][] matrix=
                {{'1','0','1','0','0'},
                 {'1','0','1','1','1'},
                 {'1','1','1','1','1'},
                 {'1','0','0','1','0'}};
        System.out.println(maximalSquare(matrix));
    }
    public static int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        if (matrix==null||matrix.length==0||matrix[0].length==0){
            return maxSide;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j]=='1'){
                    maxSide = Math.max(maxSide,1);
                    int currentMaxSide = Math.min(rows-i,columns-j);
                    for (int k = 1; k < currentMaxSide; k++) {
                        //判断新增的一行一列是否均为1
                        boolean flag = true;
                        //当斜对角线值为0
                        if(matrix[i+k][j+k]=='0'){
                            break;
                        }
                        for (int l = 0; l < k; l++) {
                            if (matrix[i+k][j+l]=='0'||matrix[i+l][j+k]=='0'){
                                flag = false;
                                break;
                            }
                        }
                        if (flag){
                            maxSide = Math.max(maxSide,k+1);
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        return maxSide*maxSide;
    }
}
