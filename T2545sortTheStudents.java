package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/22 10:37
 * 力扣 2545 根据第k场考试的分数排序 中等
 * 2024/12/22 10:45
 */
public class T2545sortTheStudents {
    public static void main(String[] args) {
        int[][] score = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k = 2;
        int[][] res = sortTheStudents(score,k);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] sortTheStudents(int[][] score,int k){
//        Arrays.sort(score, (u, v) -> v[k] - u[k]);
//        return score;
        int n = score.length;
        int m = score[0].length;
        int[] temp = new int[m];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1;j<n;j++){
                if (score[i][k]<score[j][k]){
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        return score;
    }
}
