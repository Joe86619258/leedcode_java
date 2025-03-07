package havaFinished;//public class Add1{
//    public static void main(String[] args) {
//        int[] digits ={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
//        long sum = 0L;
//        int[] arr;
//        boolean b= true;
//        for(int i=0;i<digits.length;i++){
//            if(digits[i]!=9){
//                b=false;
//            }
//            sum+= (long) (digits[i]*Math.pow(10, digits.length-i-1));
//        }
//        if(b){
//            arr = new int[digits.length+1];
//        }else{
//            arr = new int[digits.length];
//        }
//        sum++;
//        for(int i=0;i<arr.length;i++){
//            arr[arr.length-i-1]=(int)(sum%10);
//            sum=(long)(sum/10);
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}

/**
 *  @author 娄时铭
 *  @version 1.0
 *  力扣66题  :  加一
 *  2024-10-23
 *  8:30
 */
public class T66plusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            // 将当前位置的数字加1
            digits[i] = (digits[i] + 1) % 10;
            // 如果没有进位，则直接返回结果
            if (digits[i] != 0) {
                return digits;
            }
        }
        // 如果遍历完整个数组都发生了进位，说明原数组全是9，需要在最前面插入一个1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        T66plusOne T66plusOne = new T66plusOne();
        int[] digits = {1, 2, 3};
        int[] result = T66plusOne.plusOne(digits);
        for (int num : result) {
            System.out.print(num + " ");
        } // 输出: 1 2 4

        int[] digits2 = {9, 9, 9};
        int[] result2 = T66plusOne.plusOne(digits2);
        for (int num : result2) {
            System.out.print(num + " ");
        } // 输出: 1 0 0 0
    }
}
