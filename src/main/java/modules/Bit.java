package modules;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author EricTseng
 * @date 2021/9/25 10:30
 */
public class Bit {
    public static void main(String[] args) {
//        System.out.println(5<<4);
        System.out.println(5>>2);
        int nums[] = new int[4];
        for(int i = 1; i <= 4; i++) {
            nums[i-1] = i;
        }
        containsDuplicate(nums);
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet();
        for(int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        System.out.println(set.size());
        return set.size() < nums.length;
    }
}
