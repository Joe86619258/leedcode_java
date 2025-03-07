package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 122. 买卖股票的最佳时机 II
 * 2024-10-26 12:54
 */
public class T122maxProfit {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;  //总利润
        int min = prices[0];  //最低价格
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else{
                sum += prices[i] - min;
                min = prices[i];
            }
        }
        return sum;
    }
}
