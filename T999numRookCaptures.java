package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/11 11:05
 * 力扣 999 可以被一步捕获的棋子数 简单
 * 2024/12/11 11:29
 */
public class T999numRookCaptures {
    public static void main(String[] args) {
        String[][] board = {{".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", "p", ".", ".", ".", "."},
                {".", ".", ".", "R", ".", ".", ".", "p"},
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", "p", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", "."}};
        System.out.println(numRookCaptures(board));
    }

    public static int numRookCaptures(String[][] board) {
        int col = 0, row = 0;
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == "R") {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        for (int i = row-1; i >= 0 ; i--) {
            if (board[i][col] == "B"){
                break;
            }
            if (board[i][col] == "p") {
                count++;
                break;
            }
        }
        for (int i = row+1 ; i < 8; i++) {
            if (board[i][col] == "B"){
                break;
            }
            if (board[i][col] == "p") {
                count++;
                break;
            }
        }
        for (int i = col + 1; i < 8; i++) {
            if (board[row][i] == "B") {
                break;
            }
            if (board[row][i] == "p") {
                count++;
                break;
            }
        }
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == "B") {
                break;
            }
            if (board[row][i] == "p") {
                count++;
                break;
            }
        }
        return count;
    }

}
