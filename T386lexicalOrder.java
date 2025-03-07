package havaFinished;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 娄时铭
 * @version 1.0
 * 中等题
 * 力扣 386. 字典序排数
 * 2024.10.26 15：:56
 */
public class T386lexicalOrder {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(lexicalOrder(n));
    }
    public static List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
//        这是lambda表达式的参数列表
        list.sort((o1,o2)->{
            String s1 = String.valueOf(o1);
            String s2 = String.valueOf(o2);
            //升序
            // 如果o1小于o2，compareTo方法返回一个负整数,则不改变顺序；如果o1等于o2，返回0；如果o1大于o2，返回一个正整数，改变顺序。
            return s1.compareTo(s2);
            //降序
//            return s2.compareTo(s1);
        });
        return list;
    }
}
