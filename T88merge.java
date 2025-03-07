package havaFinished;

/**
 * @author 娄时铭
 * @version 1.0
 * 力扣88题  合并两个有序数组
 */
public class T88merge {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 从后向前合并，这样可以避免覆盖未处理的元素
        int a1 = m - 1, a2 = n - 1, i = m + n - 1;

        //当a1为空时，将nums2的元素全部赋值给nums1
        //当a2为空时，将nums1的元素位置    不变
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }

        //当两者还没合并完全，都还有余数时
        while(a1 >= 0 && a2 >= 0){
            //当nums1的元素大于nums2的元素时，将nums1的元素赋值给nums1的最后一个元素
            if(nums1[a1] > nums2[a2]){
                nums1[i--] = nums1[a1--];
                nums1[a1] = 0;
            }else if(nums1[a1] == nums2[a2]){
                nums1[i--] = nums1[a1];
                nums1[i--] = nums1[a1--];
                a2--;
            }else{
                nums1[i--] = nums2[a2--];
                nums2[a2] = 0;
            }
        }

        //当a1还有元素没有进行合并说明a2已经合并完全，则a1前面的元素已经是最小的元素，不需要再进行合并
        //当a2还有元素没有进行合并
        while (a2 >= 0) {
            nums1[i--] = nums2[a2--];
        }
    }
}

//public static void merge(int[] nums1, int m, int[] nums2, int n) {
//    int a1 = 0, a2 = 0;
//    int temp = 0;
//    if (m == 0) {
//        while (a2 < n) {
//            nums1[a1] = nums2[a2];
//            a1++;
//            a2++;
//        }
//    }
//    while (a1 < m && a2 < n) {
//        if (nums1[a1] < nums2[a2]) {
//
//        } else if (nums1[a1] == nums2[a2] && a1 != m - 1) {
//            temp = nums1[a1+1];
//            nums1[a1+1] = nums2[a2];
//            nums2[a2] = temp;
//            a1++;
//        } else {
//            temp = nums1[a1];
//            nums1[a1] = nums2[a2];
//            nums2[a2] = temp;
//            Arrays.sort(nums2);
//        }
//        a1++;
//    }
//    while (a2 < n) {
//        nums1[a1] = nums2[a2];
//        a1++;
//        a2++;
//    }
//}