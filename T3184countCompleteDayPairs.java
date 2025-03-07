package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/19 10:35
 * 力扣 3184 构成整天的下标对数组I 简单
 * 2024/12/19 10:39
 */
public class T3184countCompleteDayPairs {
    public static void main(String[] args) {
        int[] hours = {72,48,24,3};
        System.out.println(countCompleteDayPairs(hours));
    }
    public static int countCompleteDayPairs(int[] hours){
        int n = hours.length;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if ((hours[i]+hours[j])%24==0){
                    count++;
                }
            }
        }
        return count;
    }
}
