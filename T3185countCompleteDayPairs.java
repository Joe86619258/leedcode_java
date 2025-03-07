package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/19 10:43
 * 力扣 3185 构成整天的下标对数目II 中等
 * 2024/12/19 10:58
 * 可回看
 *
 * 解答思路：
 *      1.创建24位的数组用于存放除以24剩余余数出现的次数
 *      2.进行循环
 *          1.每次循环记录该小时数的余数值，将数组中该余数位置的值加一
 *          2.将与该余数值相加构成24的数组位取到添加到count中(相当于从后往前配对)
 *      3.输出count
 */
public class T3185countCompleteDayPairs {
    public static void main(String[] args) {
        int[] hours = {72,48,24,3};
        System.out.println(countCompleteDayPairs(hours));
    }
    public static long countCompleteDayPairs(int[] hours){
        long count = 0;
        int[] ints = new int[24];
        for (int i :hours) {
            count += ints[(24-i%24)%24];
            ints[i%24]++;
        }
        return count;
    }
}
