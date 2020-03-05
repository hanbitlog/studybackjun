package dp;

import java.util.Scanner;

public class Main1463 {
    public static int d[];

    public static int calculate(int num ){
        if(num ==1){
            return 0;
        }
        if(d[num] >0){
            return d[num];
        }
        d[num] = calculate(num-1) +1;
        if(num%3==0){
            d[num] = Math.min(d[num], calculate(num/3)+1);
        }
        if(num%2==0){
            d[num] = Math.min(d[num], calculate(num/2)+1);
        }
        return d[num];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        d = new int[num +1];
//        dp[0] = 0;
//        dp[1] = 0;
        //Bottom-up
//        for(int i=2; i<=num; i++){
//            dp[i] = dp[i-1] +1;
//            System.out.println("dp[i] :: " + dp[i]);
//            if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
//            if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
//        }


//        System.out.println(d[num]);
        //Top-down
        System.out.println(calculate(num));

        }
//        System.out.println(count);

    }

