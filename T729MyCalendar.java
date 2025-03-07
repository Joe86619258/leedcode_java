package havaFinished;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/3 14:59
 * 力扣 729 我的日程安排表I 中等
 * 2025/1/3 15:17
 */
public class T729MyCalendar {
    private List<int[]> booked;

    public T729MyCalendar() {
        booked = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {
        if (booked.isEmpty()){
            booked.add(new int[]{startTime,endTime});
            return true;
        }else{
            for (int[] ints : booked) {
                int l = ints[0], r = ints[1];
                if (l < endTime && startTime < r) {
                    return false;
                }
            }
            booked.add(new int[]{startTime,endTime});
            return true;
        }
    }
}
