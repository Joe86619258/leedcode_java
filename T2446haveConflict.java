package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/18 10:20
 * 力扣 2446 判断两个事件是否冲突 简单
 * 2024/12/18 10:37
 *
 *
 * 解题思路：
 *      1.反向思考，当没有冲突时，第一个事件的结束时间早于第二个事件开始的时间或者第二个事件的结束时间早于第一个事件开始的时间
 *      2.取反输出
 */
public class T2446haveConflict {
    public static void main(String[] args) {
        String[] event1 = {"01:15","02:00"};
        String[] event2 = {"02:00","03:00"};
        System.out.println(haveConflict(event1,event2));
    }
    public static boolean haveConflict(String[] event1 , String[] event2){
        return !(event1[1].compareTo(event2[0])<0||event2[1].compareTo(event1[0])<0);
    }
}
