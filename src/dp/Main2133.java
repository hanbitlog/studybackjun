package dp;

import java.util.Scanner;

public class Main2133 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N+1];

        int answer =0;

        if((N%2)==0){
            dp[2] = 3;
            dp[0] = 1;
            for (int i = 4; i <= N; i=i+2) {
                for (int j = 2; j <= i; j=j+2) {
                    int standard = j ==2? 3:2;
                    dp[i] = dp[i] + standard* dp[i-j];
                }
            }
            answer = dp[N];
        }
        System.out.println(answer);
    }

}
