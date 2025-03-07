package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/22 12:58
 * 力扣599 两个列表的最小索引总和
 * 简单
 * 2024/11/22 14:20
 */
public class T599findRestaurant {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] s = findRestaurant(list1, list2);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        int l1 = list1.length;
        int l2 = list2.length;
        String[] s = new String[Math.min(l1,l2)];
        int minLen = l1 + l2;
        int n=0;
        int i = 0; //第一个数组的下标
        while(i<l1){
            for (int j = 0; j < l2 && i+j<=minLen; j++) {
                if (list1[i].equals(list2[j])){
                    if (minLen != i+j) {
                        minLen = i + j;
                        n = 0;
                    }
                    s[n++] = list1[i];
                    break;
                }
            }
            i++;
        }
        return Arrays.copyOf(s, n);
    }
}
