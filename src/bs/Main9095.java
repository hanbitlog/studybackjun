package bs;

import java.util.Scanner;

public class Main9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }
        int[] dp = new int[12];

        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for (int i = 4; i <12 ; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(dp[result[i]]);
        }

    }
}
    