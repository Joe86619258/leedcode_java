package havaFinished;

import java.util.HashMap;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣290题 单词规律
 * 2024.11.6 12:44
 */
public class T290wordPattern {
    public static void main(String[] args) {
        String pattern= "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<String, String> map = new HashMap<>();
        String[] s1 = s.split(" ");
        if (pattern.length()!=s1.length){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)+"")&&!map.get(pattern.charAt(i)+"").equals(s1[i])){
                return false;
            }else if (!map.containsKey(pattern.charAt(i)+"")&&map.containsValue(s1[i])){
                return false;
            }
            map.put(pattern.charAt(i)+"",s1[i]);
        }
        return true;
    }

    /**
     * @version 1.0
     * @author: 娄时铭
     * @Date: 2024/12/13 14:18
     * 力扣 3264 K次乘运算后的最终数组I 简单
     * 2024/12/13 14:26
     */
    public static class T3264getFinalState {
        public static void main(String[] args) {
            int[] nums = {2,1,3,5,6};
            int k = 5;
            int multiplier = 2;
            nums = getFinalState(nums,k,multiplier);
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }
        public static int[] getFinalState(int[] nums ,int k,int multiplier){
            for (int i = 0;i<k;i++){
                int l = 0;
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j]<nums[l]){
                        l = j;
                    }
                }
                nums[l]*=multiplier;
            }
            return nums;
        }
    }
}
