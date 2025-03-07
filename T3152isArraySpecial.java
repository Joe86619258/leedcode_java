package havaFinished;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2025/1/5 12:48
 * 力扣 3152 特殊数组II 中等
 * 2025/01/05 13:27
 *
 * 解题思路
 *      1.创建一个数组ints,并初始化都填充为1,用nums[i] ^ nums[i + 1]) & 1遍历nums的每个数组，判断前后奇偶性是否不同
 *          若不相同，则将ints[i]的数值添加给ints[i+1]
 *      2.遍历queries,获取每个数组前后的两个值
 *          将后面的值减掉前面的值+1相当于进行求和，看是否等于ints[to]的值，如果小于等于说明在queries所指范围内nums是都不相同的，则输出true
 */
public class T3152isArraySpecial {
    public static void main(String[] args) {
        int[] nums = { 1, 4 };
        int[][] queries = { { 0, 1 } };
        boolean[] res = isArraySpecial(nums, queries);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] ints = new int[n];
        Arrays.fill(ints, 1);
        for (int i = 0; i < n - 1; i++) {
            //nums[i]^nums[i+1]按位异或
            //(nums[i]^nums[i+1])&1看最后一位是否不同
            if (((nums[i] ^ nums[i + 1]) & 1) != 0) {
                ints[i + 1] += ints[i];
            }
        }
        int length = queries.length;
        boolean[] booleans = new boolean[length];
        for (int i = 0; i < length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            booleans[i] = ints[to] >= to - from + 1;
            System.out.println(to-from+1);
        }
        return booleans;
    }
}
