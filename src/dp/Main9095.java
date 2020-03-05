package dp;

import java.util.Scanner;

public class Main9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] result = new int[n];

        for (int j = 0; j < n; j++) {
            result[j] = sc.nextInt();
         }
        sc.close();
        int[] dp = new int[12];
        dp[1] = 1;
        if(n>1) dp[2] = 2;
        if(n>2) dp[3] = 4;

        for (int i = 4; i <= 11; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int k =0; k<n; k++){
            System.out.println(dp[result[k]]);
        }

    }
}
