package havaFinished;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/15 11:12
 * 力扣 2284 最多单词数的发件人 中等
 * 2024/12/15 11:33
 */
public class T2284largestWordCount {
    public static void main(String[] args) {
        String[] messages = {"How is leetcode for everyone","Leetcode is useful for practice"};
        String[] senders = {"Bob","Charlie"};
        System.out.println(largestWordCount(messages,senders));
    }
    public static String largestWordCount(String[] messages,String[] senders){
        HashMap<String, Integer> map = new HashMap<>();
        int count;
        for (int i = 0; i < senders.length; i++) {
            count = map.getOrDefault(senders[i],0)+messages[i].split(" ").length;
            map.put(senders[i],count);
        }
        count = 0;
        String max_sender="";
        for (Map.Entry sender:map.entrySet()) {
            int val = (int)sender.getValue();
            String Resent_sender = sender.getKey()+"";
            if (val>count||(val==count&&Resent_sender.compareTo(max_sender)>0)){
                count = val;
                max_sender=Resent_sender;
            }
        }
        return max_sender;
    }
}
