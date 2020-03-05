package dp;

import java.util.Scanner;

public class Main2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //type을 long으로..
        long dp[] =new long[n+1];

        dp[1] = 1;
        if(n>1) dp[2] =1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.println(dp[n]);
    }


}
