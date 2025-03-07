package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣3242题  :  设计相邻元素求和服务
 * 2024.11.9 10:51
 */
class T3242NeighborSum {
    private int[][] grid;
    private int n;

    // 初始化对象时存储grid
    public T3242NeighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
    }

    // 返回与value相邻的元素之和
    public int adjacentSum(int value) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    // 检查上边的元素
                    if (i > 0) sum += grid[i - 1][j];
                    // 检查下边的元素
                    if (i < n - 1) sum += grid[i + 1][j];
                    // 检查左边的元素
                    if (j > 0) sum += grid[i][j - 1];
                    // 检查右边的元素
                    if (j < n - 1) sum += grid[i][j + 1];
                    return sum; // 找到value后立即返回
                }
            }
        }
        return sum;
    }

    // 返回与value对角线相邻的元素之和
    public int diagonalSum(int value) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    // 检查上边的元素
                    if (i > 0 && j > 0) sum += grid[i - 1][j - 1];
                    // 检查下边的元素
                    if (i > 0 && j < n - 1) sum += grid[i - 1][j + 1];
                    // 检查左边的元素
                    if (i < n - 1 && j > 0) sum += grid[i + 1][j - 1];
                    // 检查右边的元素
                    if (i < n - 1 && j < n - 1) sum += grid[i + 1][j + 1];
                    return sum; // 找到value后立即返回
                }
            }
        }
        return sum;
    }
}
