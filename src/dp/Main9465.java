package dp;

import java.util.Scanner;

public class Main9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            int n = sc.nextInt();
            int score[][] = new int[3][n+1];
            int dp[][] = new int[n+1][4];
            for (int k = 0; k < 2; k++) {
                for (int j = 1; j <=n; j++) {
                    score[k][j] = sc.nextInt();
                }
            }
            dp[1][0] = 0;
            dp[1][1] = score[0][1];
            dp[1][2] = score[1][1];

            for (int j = 2; j <= n; j++) {
                dp[j][0] = Math.max(dp[j-1][0],Math.max(dp[j-1][1],dp[j-1][2]));
                dp[j][1] = Math.max(dp[j-1][0],dp[j-1][2])+score[0][j];
                dp[j][2] = Math.max(dp[j-1][0],dp[j-1][1])+score[1][j];
            }
            int answer = Math.max(dp[n][0], Math.max(dp[n][1],dp[n][2]));

            System.out.println(answer);
        }
    }


}
