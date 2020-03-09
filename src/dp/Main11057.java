package dp;

import java.util.Scanner;

public class Main11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][10];
        int mod = 10007;

        for (int i = 0; i < 10; i++) {
            dp[1][i]  = 1;
        }

        /*if(n>1){
            for (int i = 2; i <= n; i++) {
                dp[i][0] =1;
                for (int j = 1; j <10 ; j++) {
                    dp[i][j] = (dp[i][j-1] + dp[i-1][j])%10007;
                }
            }
        }*/
        for (int i = 2; i <=n ; i++) {
            for (int j = 0; j <10 ; j++) {
                for (int k = 0; k <=j ; k++) {
                    dp[i][j] = (dp[i][j] + dp[i-1][k])%mod;
                }
            }
        }


        int result =0;
        for (int i = 0; i < 10; i++) {
            result = result + dp[n][i];
        }
        System.out.println(result%mod);
    }
}
