package havaFinished;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/18 11:34
 * 力扣 3285 找到稳定山的下标 简单
 * 2024/12/18 11:40
 */
public class T3285stableMountains {
    public static void main(String[] args) {
        int[] height = {10,1,10,1,10};
        int threshold = 3;
        List<Integer> list = stableMountains(height,threshold);
        for (int i : list) {
            System.out.println(i);
        }
    }
    public static List<Integer> stableMountains(int[] height , int threshold){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < height.length-1; i++) {
            if (height[i]>threshold){
                list.add(i+1);
            }
        }
        return list;
    }
}
