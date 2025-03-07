package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/28 10:09
 * 力扣 3208 交替组II 中等
 * 2024/11/29 13:54
 */
public class T3208numberOfAlternatingGroups {
    public static void main(String[] args) {
        int[] colors = {0,1,0,0,1,0,1};
        int k =6;
        System.out.println(numberOfAlternatingGroups(colors,k));
    }
    //方法1 ,但运算超时
//    public static int numberOfAlternatingGroups(int[] colors, int k) {
//        int count = 0;
//        int n = colors.length;
//        for (int i = 0; i < n; i++) {
//            if (isDiffer(colors,i,k-1)){
//                System.out.println(i);
//                count++;
//            }
//        }
//        return count;
//    }
//    public static boolean isDiffer(int[] colors,int i , int k){
//        if (k==0){
//            return true;
//        }
//        int n = colors.length;
//        int j = i+1<n ? i+1:0;
//        if (colors[i]!=colors[j]){
//            i = i<n-1?++i:0;
//            return isDiffer(colors,i,--k);
//        }else{
//            return false;
//        }
//    }


//    public static int numberOfAlternatingGroups(int[] colors, int k) {
//        int n = colors.length;
//        int j;
//        ArrayList<Integer> list = new ArrayList<>();
//        //存放前后两个颜色相同的位置下标
//        for (int i = 0; i < n; i++) {
//            j = i+1<n?i+1:0;
//            if (colors[i]==colors[j]){
//                list.add(i);
//            }
//        }
//        int count = 0;
////        想通过循环确定圈圈内没有两个相邻数字相等的下标
//        for (int i = 0; i < n; i++) {
//            for (int l = 0; l < list.size(); l++) {
////                if (list.get(l)>(i+k-2)%n){
////                    count++;
////                    break;
////                } else if (list.get(l)<) {
////
////                }
//            }
//        }
//        return count;
//    }

    public static int numberOfAlternatingGroups(int[] colors, int k){
        int count = 1;
        int res = 0;
        int n = colors.length;
        for (int i = -k+2; i < n; i++) {
            if (colors[(i + n) % n] != colors[(i - 1 + n) % n]){
                count++;
            }else{
                count=1;
            }
            if (count>=k){
                res++;
            }
        }
        return res;
    }
}
