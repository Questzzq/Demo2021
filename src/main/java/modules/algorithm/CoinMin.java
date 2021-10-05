package modules.algorithm;

import java.util.Scanner;

/**
 * @author EricTseng
 * @date 2021/10/5 13:53
 */
public class CoinMin {
    static int MAX_NUM = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int A[] = {2, 5, 7};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int sum = scanner.nextInt();
            System.out.println(getCoinMin(A, sum));
        }
    }

    /**
     * 2.5.7面值的硬币凑出sum，最少需要用多少枚硬币
     * @param sum
     * @return
     */
    public static int getCoinMin(int []A, int sum) {
        int f[] = new int[sum+1];
        int n = A.length;
        f[0] = 0;
        int i, j;

        for(i = 1; i <= sum; i++) {
            f[i] = MAX_NUM;
        }
        return 0;
    }
}
