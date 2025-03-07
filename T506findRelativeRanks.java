package havaFinished;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/16 23:33
 * 力扣 506 相对名次 简单
 * 2025/1/17 00:42
 */
public class T506findRelativeRanks {
    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        String[] strings = findRelativeRanks(score);
        for (String s : strings) {
            System.out.println(s);
        }
    }
    public static String[] findRelativeRanks(int[] score){
        int[] ints = score.clone();
        int n = ints.length;
        String[] strings = new String[n];
        HashMap<Integer, String> map = new HashMap<>();
        Arrays.sort(ints);
        for (int i = 0; i < n; i++) {
            if (i==n-3){
                map.put(ints[i],"Bronze Medal");
            } else if (i == n-2) {
                map.put(ints[i],"Silver Medal");
            } else if (i == n-1) {
                map.put(ints[i], "Gold Medal");
            }else{
                map.put(ints[i],n-i+"");
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i : map.keySet()) {
                if (i == score[j]) {
                    strings[j] = map.get(i);
                }
            }
        }

        return strings;
    }
}
