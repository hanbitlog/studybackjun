package dp;

import java.util.Scanner;

public class Main11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n+1];
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            prices[i] = sc.nextInt();
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                dp[i] = Math.max(dp[i], dp[i-j] + prices[j]);
            }
        }


        /*if(n==1) dp[1] = prices[1];
        max = Math.max(prices[1]*n, prices[n]);
        if(n>1){
            for (int i = 2; i <n ; i++) {
                max = Math.max(max, prices[n-i]+prices[i] );
            }
        }*/
        System.out.println(dp[n]);
    }


}
