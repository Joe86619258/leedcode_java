package havaFinished;

import java.util.*;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/24 12:48
 * 力扣 49 字母异位词分组 中等
 * 2024/11/24 13:04
 */
public class T49groupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.println(lists.get(i).get(j));
            }
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            //1.将获取的s转换成char类型的数组
            char[] charArray = s.toCharArray();
            //2.对该数组进行排序
            Arrays.sort(charArray);
//            String str = charArray.toString();
            String str = new String(charArray);
            //尝试判断map中是否有存放与s类似的字符串的ArrayList，若有则返回该List，若没有则创建空白ArrayList
            List<String> list = map.getOrDefault(str, new ArrayList<String>() {});
            //若已经存在list，则在原来的list里面添加现在的s，若没有list，在上方创建了新的空白list，将现在的s添加进去
            list.add(s);
            //将更改后的list添加进map当中去
            map.put(str,list);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
