package havaFinished;

import java.util.ArrayList;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣202 快乐数
 * 2024.10.28 16：36
 * 先判断该数是否等于一，若等于1则直接返回
 * 若不等于1进行循环
 * 创建一个ArrayList,当n包含在ArrayList中时，说明已经进入死循环最终答案无法为1，即输出false
 */
public class T202isHappy {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        ArrayList<Integer> ints = new ArrayList<>();  //保存已出现过的数字
        while (true) {
            if (ints.contains(n)) {
                return false;
            }
            ints.add(n);
            int sum = 0;
            int i = 0;
            while (n != 0) {
                i = n % 10;
                sum += i * i;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }
    }

}
