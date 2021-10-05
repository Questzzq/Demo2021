package modules.structure;

import java.util.*;

/**
 * @author EricTseng
 * @date 2021/10/5 0:33
 */
public class Intersection {
    public static void main(String[] args) {
        int [] nums1 = {3, 1, 2};
        int [] nums2 = {1};
        printList(nums1);
        printList(nums2);
        intersect(nums1, nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if(map.isEmpty() || !map.containsKey(nums1[i])) {
                map.put(nums1[i], 1);
            } else if(map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i])+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        printList(res);
        return res;
    }

    public static void printList(int [] resNums) {
        for (int i = 0; i < resNums.length; i++) {
            System.out.print(resNums[i] + " ");
        }
        System.out.println();
    }
}
