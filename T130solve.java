package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣130题
 * 被围绕的区域
 */
public class T130solve {
    public static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        solve(board);
    }

    public static void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }
        int m = board.length, n = board[0].length; //m行n列
        for (int i = 0; i < n; i++) { //第一行和最后一行的数据
            if (board[0][i] == 'O'){
                trackback(0,i,board);
            }
            if (board[m-1][i] == 'O'){
                trackback(m-1,i,board);
            }
        }
        for (int i = 1; i < m; i++) { //第一列和最后一列的数据
            if (board[i][0] == 'O'){
                trackback(i,0,board);
            }
            if (board[i][n-1] == 'O'){
                trackback(i,n-1,board);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if (board[i][j] == 'A'){
                    board[i][j] = 'O';
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'A'){
                    board[i][j] = 'O';
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void trackback(int x, int y, char[][] board) {
        if (x<0 || x>=board.length || y<0 || y>=board[0].length || board[x][y]!= 'O'){
            return;
        }
        if (board[x][y] == 'O'){
            board[x][y] = 'A';
            //将与边界相连的'O'变成'A'
            trackback(x+1,y,board);
            trackback(x-1,y,board);
            trackback(x,y+1,board);
            trackback(x,y-1,board);
        }
    }
}
