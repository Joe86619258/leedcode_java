package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/2 18:07
 * 力扣223 矩形面积 中等
 * 2024/12/2 18:23
 * 注意：需要判断是否有重叠
 */
public class T223computeArea {
    public static void main(String[] args) {
        int ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2;
        System.out.println("总面积为"+computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
    }
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        int area1 = Math.abs(ax2-ax1)*Math.abs(ay2-ay1);
        int area2 = Math.abs(bx2-bx1)*Math.abs(by2-by1);
        if (bx2<=ax1||bx1>=ax2||by1>=ay2||by2<=ay1){
            return area1+area2;
        }
        int common_width = Math.abs(Math.min(ax2,bx2)-Math.max(ax1,bx1));
        int common_height = Math.abs(Math.min(ay2,by2)-Math.max(ay1,by1));
        int commonArea = common_height*common_width;
        return area1+area2-commonArea;
    }
}
