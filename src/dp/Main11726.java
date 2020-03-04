package dp;

import java.util.Scanner;

public class Main11726 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mod = 100007;
        int num = sc.nextInt();
        sc.close();
        int[] dp = new int[num+1];

        dp[1] = 1;
        if(num>1) dp[2] = 2;

        for (int i = 3; i <=num; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%mod;
        }
        System.out.println(dp[num]);

    }
}
