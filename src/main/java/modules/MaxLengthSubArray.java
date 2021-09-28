package modules;


/**
 * @author EricTseng
 * @date 2021/9/25 12:26
 */
public class MaxLengthSubArray {
    public static void main(String[] args) {
        int nums[] = new int[120];
        for(int i = 0; i < 120; i++) {
            nums[i] = (int) (Math.random()*1000);
            System.out.print(nums[i]);
            System.out.print("  ");
        }
        System.out.println("\n");
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            int tmpRes = maxLengthFromThis(i, nums);
            res = res > tmpRes? res: tmpRes;
        }
        System.out.println(res);
    }

    public static int maxLengthFromThis(int i, int [] nums) {
        if(i == nums.length - 1) {
            return 1;
        }
        int result = 1;
        for(int j = i+1; j < nums.length; j++) {
            if(nums[j] > nums[i]) {
                result = Math.max(maxLengthFromThis(j, nums) + 1, result);
            }
        }
        return result;
    }
}
