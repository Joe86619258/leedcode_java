package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/16 16:05
 * 力扣 LCR159 库存管理III 简单
 * 2025/1/16 16:20
 */
public class TLCR159inventoryManagement {
    public static void main(String[] args) {
        int[] stock = {0,2,3,6};
        int cnt = 2;
        int[] ints = inventoryManagement(stock,cnt);
        for (int i :ints) {
            System.out.println(i);
        }
    }
    public static int[] inventoryManagement(int[] stock,int cnt){
        Arrays.sort(stock);
        return Arrays.copyOfRange(stock,0,cnt);
    }
}
