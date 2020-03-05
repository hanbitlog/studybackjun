package dp;

import java.util.Scanner;

public class Main2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int p[] = new int[n+1];
        int dp[] = new int[n+1];

        for (int i = 1; i <=n ; i++) {
            p[i] = sc.nextInt();
        }
        dp[1] = p[1];
        if(n>1) dp[2] = p[1] + p[2];
        // 1. 본인이 선택 안하는 경우, 전에 가짓수랑 동일
        // 2. 한번 연속 전에것은 안먹어고, 지금은 먹고
        // 3. 두번 연속 지금것 먹고, 전에것도 먹고 전전에것은 먹지 말고.
        for (int i = 3; i <=n; i++) {
             dp[i] = Math.max(dp[i-1],Math.max(dp[i-2]+p[i], p[i]+p[i-1]+dp[i-3] ) );
        }
        System.out.println(dp[n]);

    }


}

