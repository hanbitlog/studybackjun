package dp;

import java.util.Scanner;

public class Main11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n + 1];
        int dp[] = new int[n + 1];
        int sum[] = new int[n + 1];

        for (int i = 1; i <=n ; i++) {
            num[i] = sc.nextInt();
            dp[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                if(num[j] < num[i] && dp[i] <= dp[j]+num[i]){
                    dp[i] = dp[j] + num[i];
                }
            }
        }

        int max=0;
        for (int i = 1; i <=n ; i++) {
            if(max < dp[i]) max= dp[i];
        }
        System.out.println(max);
    }


}
