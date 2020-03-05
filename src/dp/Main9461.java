package dp;

import java.util.Scanner;

public class Main9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];

        for (int j = 0; j < n; j++) {
            result[j] = sc.nextInt();
        }
        sc.close();
        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i-5] + dp[i-1];
        }
        for(int k =0; k<n; k++){
            System.out.println(dp[result[k]]);
        }

    }


}
