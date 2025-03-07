package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 * 力扣121题  :  买卖股票的最佳时机
 * 2024.10.25 20:11
 */
public class T121maxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;  //最大利润
        for (int i = 0; i < prices.length-1; i++) {   //最低位价格下标
            for (int j = i+1; j < prices.length; j++) {
                if(prices[i]>prices[j]){ //如果前面的价格比后面的价格高，直接将低位价格的下标赋给i，继续寻找下一个低位价格
                    i=j;
                }else if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
            if(prices[i]==0){  //当低位价格是0已经是最低购入价格，可以直接跳过后面的寻找最低价的过程
                break;
            }
        }
        return max;
    }
}
