package havaFinished;

import java.util.Arrays;

/**
 * @author 娄时铭
 * @version 1.0
 * 简单题
 * 力扣 289. 生命游戏
 * 2024.10.30 10:37
 */
public class T289gameOfLife {
    public static void main(String[] args) {
        int[][] board ={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
    }
    public static void gameOfLife(int[][] board) {
        int[][] newBoard = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                newBoard[i][j] = isLived(board,i,j);
            }
        }
        board = Arrays.copyOfRange(newBoard,0,board.length);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.println(board[i][j]);
            }
        }
    }
    public static int isLived(int[][] board,int i,int j){
        int count = 0;  //周围活细胞数量
        for (int k = i-1; k <= i+1; k++) {
            if (k<0||k>=board.length){
                continue;
            }
            for (int l = j-1; l <= j+1; l++) {
                if (l<0||l>=board[0].length||(k==i&&l==j)){
                    continue;
                }
                if (board[k][l]==1){
                    count++;
                }
            }
        }
        if (board[i][j]==1){
            if (count<2||count>3){
                return 0;
            }else{
                return 1;
            }
        }else{
            if (count==3){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
