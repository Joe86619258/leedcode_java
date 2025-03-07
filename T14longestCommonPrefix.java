package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 已完成
 *  力扣第14题
 */
public class T14longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String output = "" ;
        if(strs == null || strs.length==0){
            System.out.println("");
        }else{
            int minLength = strs[0].length();
            for (String str : strs) {
                minLength = Math.min(minLength, str.length());
            }
            for(int i = 0 ; i <minLength;i++){//第i位进行比较
                char c= strs[0].charAt(i);
                for(int j = 1 ;j<strs.length;j++){ //将strs的第j位字符串与第一个字符串进行比较
                    if(c!=strs[j].charAt(i)){
                        System.out.println(strs[0].substring(0,i));
                    }
                }
            }
            System.out.println(strs[0].substring(0,minLength));
        }
    }
}
