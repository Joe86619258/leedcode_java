package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/13 14:45
 * 力扣 299 猜数字游戏 中等
 * 2024/12/13 15:39
 */
public class T299getHint {
    public static void main(String[] args) {
        String secret = "1807";
        String guess = "7810";
        System.out.println(getHint(secret,guess));
    }
    public static String getHint(String secret,String guess){
        //方法1
        int Bulls = 0;
        int Cows = 0;
        StringBuffer stringBuffer = new StringBuffer(guess);
        StringBuffer s = new StringBuffer(secret);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==stringBuffer.charAt(i)){
                stringBuffer.deleteCharAt(i);
                s.deleteCharAt(i);
                i--;
                Bulls++;
            }
        }
        int j ;
        for (int i = 0; i < s.length(); i++) {
            j = stringBuffer.indexOf(""+s.charAt(i));
            if(j>=0){
                stringBuffer.deleteCharAt(j);
                Cows++;
            }
        }
        return Bulls +"A"+Cows +"B";

//        方法2：
//        HashMap<Integer, Character> map = new HashMap<>();
//        int Bulls = 0;
//        int Cows = 0;
//        Character c;
//        StringBuffer stringBuffer = new StringBuffer(guess);
//        for (int i = 0; i < secret.length(); i++) {
//            c = secret.charAt(i);
//            map.put(i,c);
//        }
//        for (int i = 0; i < secret.length(); i++) {
//            if(map.get(i)==stringBuffer.charAt(i-Bulls)){
//                System.out.println("Bulls =" +map.get(i));
//                stringBuffer.deleteCharAt(i-Bulls);
//                map.remove(i);
//                Bulls++;
//            }
//        }
//        int j ;
//        for (int i = 0; i < secret.length(); i++) {
//            j = stringBuffer.indexOf(""+map.get(i));
//            if(j>=0){
//                System.out.println("Cows="+map.get(i));
//                stringBuffer.deleteCharAt(j);
//                Cows++;
//            }
//        }
//        return Bulls +"A"+Cows +"B";
    }
}
