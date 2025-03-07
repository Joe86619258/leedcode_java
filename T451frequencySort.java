package havaFinished;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/20 19:41
 * 力扣 451 根据字符出现频率排序 中等
 * 2024.12.20 20:00
 */
public class T451frequencySort {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            char c= list.get(i);
            int size = map.get(c);
            for (int j = 0; j < size; j++) {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }
}
