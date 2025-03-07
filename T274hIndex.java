package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/22 20:13
 * 力扣 274 H指数 中等
 * 2024/11/22 20:30
 * 分开记录被引用次数和出版数
 */
public class T274hIndex {
    public static void main(String[] args) {
        int[] citations={3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        int result = 1;
        int i = citations.length-1;
        Arrays.sort(citations);
        while (i>=0&&result<=citations[i]){ //当被引用数大于出版数时
            result++;
            i--;
        }
        return --result;//因为出版数大于被引用数，所以减一
    }
}
