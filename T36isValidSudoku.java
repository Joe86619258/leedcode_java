package havaFinished;

import java.util.Arrays;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣36题
 */
public class T36isValidSudoku {
    public static void main(String[] args) {
    }
    public static boolean isValidSudoku(char[][] board) {
        boolean checkRow = checkRow(board); //检查行
        boolean checkCol = checkCol(board); //检查列
        boolean checkBox = checkBox(board); //检查九宫格
        return checkBox && checkCol && checkRow;
    }
    public static boolean checkRow(char[][] row) {
        for (int i = 0; i < row.length; i++) {
            char[] s = new char[9]; //存放每一行的元素
            Arrays.fill(s,'0');
            int count = 0; //代表s中的元素个数
            for (int j = 0; j < row[i].length; j++) {
                if(row[i][j]=='.'){
                    continue;
                }else{
                    for (int m = 0; m < count; m++){
                        if(s[m]==row[i][j]){
                            return false;
                        }
                    }
                    s[count++] = row[i][j]; //s[0] s[1] s[2]
                }
            }
        }
        return true;
    }
    public static boolean checkCol(char[][] col) { //检查列
        for (int i = 0; i < col.length; i++) {
            char[] s = new char[9]; //存放每一行的元素
            Arrays.fill(s,'0');
            int count = 0; //代表s中的元素个数
            for (int j = 0; j < col[i].length; j++) {
                if(col[j][i]=='.'){
                    continue;
                }
                for (int m = 0;m < count; m++){
                    if(s[m]==col[j][i]){
                        return false;
                    }
                }
                s[count++] = col[j][i]; //s[0] s[1] s[2]
            }
        }
        return true;
    }
    public static boolean checkBox(char[][] box) { //检查九宫格
        for (int i = 0; i < box.length; i += 3) {
            for (int j = 0; j < box[i].length; j += 3) {
                char[] s = new char[9]; //存放每一行的元素
                Arrays.fill(s,'0');
                int count = 0; //代表s中的元素个数
                for (int k = i; k < i + 3; k++){
                    for (int l = j; l < j + 3; l++) {
                        if(box[k][l]=='.'){
                            continue;
                        }else{
                            for (int m = 0; m < count; m++) {
                                if(s[m]==box[k][l]){
                                    return false;
                                }
                            }
                            s[count++] = box[k][l]; //s[0] s[1] s[2]
                        }
                    }
                }
            }
        }
        return true;
    }
}
