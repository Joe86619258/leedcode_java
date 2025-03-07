package havaFinished;

import java.util.HashMap;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/2 15:43
 * 力扣 205 同构字符串 简单
 * 2024/12/2 16:04
 */
public class T205isIsomorphic {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s , String t){
        if (s.length()!=t.length()){
            return false;
        }
        int n = s.length();
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if ((map1.containsKey(c1)&&map1.get(c1)!=c2)||(map2.containsKey(c2)&&map2.get(c2)!=c1)){
                return false;
            }
            map1.put(c1,c2);
            map2.put(c2,c1);
        }
        return true;
    }
}
