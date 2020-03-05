package dp;

import java.util.Scanner;

public class Main2011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

       /* int mod =1000000;
        int[] dp = new int[str.length() +1 ];

        dp[0] = dp[1] = 1;

        for (int i = 2; i <= str.length(); i++) {
            int now = i-1;
            if(str.charAt(now) > '0')
                dp[i] = dp[i-1];
            int su = (str.charAt(now -1) -'0')*10 + (str.charAt(now -1) -'0');
            if(su>=10 && su<=26)
                dp[i] = (dp[i] + dp[i-2]) % mod;
        }
        System.out.println(str.equals("0") ? 0 : dp[str.length()]);*/
        int length = str.length();
        long[] dp = new long[length+1]; dp[0] = dp[1] = 1;

        if(str.charAt(0) == '0') System.out.print(0);
        else if(str.charAt(length-1) == '0' && str.charAt(length-2) != '1' && str.charAt(length-2) != '2') System.out.print(0);
        else {
            for(int i = 2; i <= length; i++) {
                int tmp = Integer.parseInt(str.charAt(i-1) + "");
                if(tmp > 0) dp[i] = dp[i-1] % 1000000;

                tmp += Integer.parseInt(str.charAt(i-2) + "")*10;
                if(10 <= tmp && tmp <= 26) dp[i] = (dp[i] + dp[i-2]) % 1000000;
            }
            System.out.print(dp[length]);
        }

        }

    }

