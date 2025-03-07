package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/13 23:51
 * 力扣 165 比较版本号 中等
 * 2025/1/14 00:03
 */
public class T165compareVersion {
    public static void main(String[] args) {
        String version1 = "1.0";
        String version2 = "1.0.0.0";
        System.out.println(compareVersion(version1,version2));
    }
    public static int compareVersion(String version1,String version2){
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        for (int i = 0; i < split1.length||i<split2.length; i++) {
            int i1 = i<split1.length?Integer.parseInt(split1[i]):0;
            int i2 = i<split2.length?Integer.parseInt(split2[i]):0;
            if (i1<i2){
                return -1;
            }
            if (i1>i2){
                return 1;
            }
        }
        return 0;
    }
}
