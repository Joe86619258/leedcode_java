package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/29 18:22
 * 力扣240 搜索二维矩阵II 中等
 * 2024/11/29 18:30
 */
public class T240searchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},
                {2,5,8,12,19},{3,6,9,16,22},
                {10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
