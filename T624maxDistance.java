package havaFinished;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/2/27 16:47
 * 力扣 624 数组列表中的最大距离 中等
 * 2025-2-27 18:25
 * 解题思路：
 *      1.先将第一个数组中的最大值最小值进行记录成最大值最小值
 *      2.遍历后面的数组，将每个数组中的最大值和已经记录的最小值进行做差与最大距离进行比较
 *      3.将每个数组中的最小值和已经记录的最大值进行做差与最大值进行比较
 *      4.将数组中的最大值和最小值与已经记录的进行比较进行更新
 *      5.返回最大距离
 */
public class T624maxDistance {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list1.add(list);
        list.clear();
        list.add(4);
        list.add(5);
        list1.add(list);
        list.clear();
        list.add(1);
        list.add(2);
        list.add(3);
        list1.add(list);
        System.out.println(maxDistance(list1));
    }
    public static int maxDistance(List<List<Integer>> arrays) {
        int maxVal = arrays.get(0).get(arrays.get(0).size()-1);
        int minVal = arrays.get(0).get(0);
        int Dist = 0;
        for (int i = 1; i < arrays.size(); i++) {
            int currminVal = arrays.get(i).get(0);
            int currmaxVal = arrays.get(i).get(arrays.get(i).size()-1);
            Dist = Math.max(Dist, Math.abs(currmaxVal - minVal));
            Dist = Math.max(Dist, Math.abs(maxVal - currminVal));
            minVal = Math.min(minVal, currminVal);
            maxVal = Math.max(maxVal, currmaxVal);
        }
        return Dist;
    }
}
