package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 简单题
 * 力扣 383. 赎金信
 * 2024.10.26 16:23
 */
public class T383canConstruct {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
/**方法1
 *         int i = 0;
 *         while (i<ransomNote.length()&&magazine.contains(String.valueOf(ransomNote.charAt(i)))){
 *             magazine = magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)),"");
 *             i++;
 *         }
 *         return i == ransomNote.length();
*/
//        方法2
        int[] nums = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            nums[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            nums[ransomNote.charAt(i)-'a']--;
            if (nums[ransomNote.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
}
