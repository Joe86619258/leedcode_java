package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/11 12:31
 * 力扣 3274 检查棋盘方格颜色是否相同 简单
 * 2024/12/11 12:41
 */
public class T3274checkTwoChessboards {
    public static void main(String[] args) {
        String coordinate1="a1";
        String coordinate2="c3";
        System.out.println(checkTwoChessboards(coordinate1,coordinate2));
    }
    public static boolean checkTwoChessboards(String coordinate1,String coordinate2){
        boolean isBlack1,isBlack2;
        isBlack1 = (coordinate1.charAt(0)-'a')%2 == (int)coordinate1.charAt(1)%2;
        isBlack2 = (coordinate2.charAt(0)-'a')%2 == (int)coordinate2.charAt(1)%2;
        return isBlack1==isBlack2;
    }
}
