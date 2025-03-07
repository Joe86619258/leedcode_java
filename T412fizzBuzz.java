package havaFinished;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣412题  :  Fizz Buzz
 * 2024-10-21
 * 23:40
 */
public class T412fizzBuzz {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        int n = 15;
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
