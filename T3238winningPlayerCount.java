package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/24 12:01
 * 力扣 3238 求出胜利玩家的数目 简单
 * 2024/11/24 12:15
 */
public class T3238winningPlayerCount {
    public static void main(String[] args) {
        int n = 5;
        int[][] pick = {{1,1},{2,4},{2,4},{2,4}};
        System.out.println(winningPlayerCount(n,pick));
    }
    public static int winningPlayerCount(int n,int[][] pick){
        int count = 0;
        int[][] res = new int[n][11];
        for (int[] ints :pick) {
            res[ints[0]][ints[1]]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 11; j++) {
                if (res[i][j]>=i+1){
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
