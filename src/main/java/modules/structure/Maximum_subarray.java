package modules.structure;

/**
 * @author EricTseng
 * @date 2021/10/5 10:58
 */
public class Maximum_subarray {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray_1(nums));
    }

    /**
     * 动态规划算法
     * @param nums
     * @return
     */
    public static int maxSubArray_1(int[] nums) {
        int i, res;
        res = nums[0];
        for (i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i-1]+nums[i], nums[i]);
            if(nums[i] > res)
                res = nums[i];
        }
        return res;
    }
}
