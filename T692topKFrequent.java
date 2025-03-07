package havaFinished;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/14 13:33
 * 力扣 692 前K个高频单词 中等
 * 2025/1/14 14:22
 * 难点:
 *      1.PriorityQueue
 *      2.排序
 */
public class T692topKFrequent {
    public static void main(String[] args) {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        List<String> strings = topKFrequent(words, k);
        for (String s : strings) {
            System.out.println(s);
        }

    }
    public static List<String> topKFrequent(String[] words,int k){
        ArrayList<String> strings = new ArrayList<>();
        Arrays.sort(words);
        int n = words.length;
        if (n == 1) {
            strings.add(words[0]);
            return strings;
        }
        //先按出现的次数排，若次数相等则按字典大小排序
        PriorityQueue<String[]> queue = new PriorityQueue<>((a, b) -> {
            int countCompare = Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1]));
            if (countCompare != 0) {
                return countCompare;
            } else {
                return a[0].compareTo(b[0]);
            }
        });
        int left = 0;
        int right = 1;
        while (right < n) {
            if (right == n || !words[left].equals(words[right])) {
                queue.offer(new String[]{words[left], "" + (right - left)});
                left = right;
            }
            right++;
        }
        for (int i = 0; i < k; i++) {
            strings.add(queue.poll()[0]);
        }
        return strings;
    }
}
