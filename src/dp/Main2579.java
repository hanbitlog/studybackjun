package dp;

import java.util.Scanner;

/**
 * The type Main 2579.
 */
public class Main2579 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[301];
        int[] p = new int[301];
        for (int i = 1; i <=n ; i++) {
            p[i] = sc.nextInt();
        }
        sc.close();

        dp[1] = p[1];
        if(n>1) dp[2] = p[1]+p[2];

        for (int i = 3; i <=n; i++) {
            dp[i] = Math.max(dp[i-3] + p[i-1] + p[i], dp[i-2]+p[i]);
        }
        System.out.println(dp[n]);
    }


}
