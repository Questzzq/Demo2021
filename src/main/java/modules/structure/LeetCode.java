package modules.structure;

/**
 * @author EricTseng
 * @date 2021/10/2 18:00
 */
public class LeetCode {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result = new int[m+n];

        int ptr1 = 0;
        int ptr2 = 0;
        int i = 0;

        while (ptr1 < m && ptr2 < n) {
            if(nums1[ptr1] < nums2[ptr2]) {
                result[i++] = nums1[ptr1++];
            } else {
                result[i++] = nums2[ptr2++];
            }
        }
        while (ptr1 < m) {
            result[i++] = nums1[ptr1++];
        }
        while (ptr2 < n) {
            result[i++] = nums2[ptr2++];
        }
        for(int t = 0; t < m+n; t++) {
            nums1[t] = result[t];
        }
    }
}
