package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/15 00:18
 * 力扣 2037 是每位学生都有作为的最少移动次数 简单
 * 2025/1/15 00:21
 */
public class T2037minMovesToSeat {
    public static void main(String[] args) {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        System.out.println(minMovesToSeat(seats, students));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        int n = seats.length;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
}
