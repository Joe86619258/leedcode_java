package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣79题  :  单词搜索
 * 2024-10-26  12:34
 */
public class T79exist {
    public static void main(String[] args) {
        char[][] board = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}
        };
        String word = "AAB";
        System.out.println(exist(board, word));
    }
    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        // 向下 向上 向右 向左
        boolean res = dfs(board, i+1, j, word, index + 1) ||
                dfs(board, i-1, j, word, index + 1) ||
                dfs(board, i, j+1, word, index + 1) ||
                dfs(board, i, j-1, word, index + 1);
        board[i][j] = temp; // 回溯，恢复原字符
        return res;
    }
}
