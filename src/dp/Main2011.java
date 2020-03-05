package dp;

import java.util.Scanner;

public class Main2011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split("");
        int count =0;
        int mod = 1000000;
        int[] dp = new int[str.length() + 1];
        dp[0] = dp[1]=1;
        for (int i = 2; i < str.length(); i++) {
            int now = i-1;
            if(str.charAt(now) > '0')
                dp[i] = dp[i-1];
            int su = (str.charAt(now -1) - '0') * 10 + (str.charAt(now) - '0');

            if(su >=10 && su <=26)
                dp[i] = (dp[i] + dp[i=2]) % mod;
        }
        System.out.println(str.equals("0") ? 0 : dp[str.length()]);

    }
}
