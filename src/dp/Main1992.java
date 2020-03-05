package dp;

import java.util.Scanner;

public class Main1992 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr.add(sc.nextInt());
        }
        int max = -1000;
        int val = 0;
        int dp = 0;
        for (int i = 0; i <num; i++) {
            System.out.println("----" + i);
            System.out.println("before max" + max);
            val = val + arr.get(i);
            dp= Math.max(val, arr.get(i));
            System.out.println("dp" + dp);
            max = Math.max(max, dp);
            System.out.println("val" + val);
            System.out.println("max" + max);
        }*/
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];
        int max;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        dp[0] = arr[0];
        max = arr[0];
        for(int i=1; i<N; i++){
            dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }
        sc.close();

        System.out.println(max);
    }

}
