package havaFinished;

import java.util.HashMap;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣219题 存在重复元素II
 * 2024.10.28 19：19
 */
public class T219containsNearbyDuplicate {
    public static void main(String[] args) {
//        int[] nums={1,2,3,1,2,3};
//        int[] nums={1,0,1,1};
        int[] nums={1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums,int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)&&i- map.get(num)<=k){
                return true;
            }
            map.put(num,i);
        }
        return false;
/**
 *ArrayList<Integer> list = new ArrayList<>();
 *         for (int i = 0; i < nums.length; i++) {
 *             if (list.contains(nums[i])){
 *                 int index = list.lastIndexOf(nums[i]);
 *                 if(list.size()-index<=k){
 *                     return true;
 *                 }
 *             }
 *             if (list.size()==k){
 *                 list.remove(0);
 *             }
 *             list.add(nums[i]);
 *         }
 *         return false;
 */

    }
}
