package dp;

import java.util.Scanner;

public class Main10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000000;
        int n = sc.nextInt();
        sc.close();
        long[][] arr = new long[101][11];
        long result = 0;
        //갯수칸 만들어주고,
        //n만큼 돌려서 점수 내보내기.
        // 초기화
        for (int i = 1; i <= 9; i++) {
            arr[1][i] = 1;
            if(i==9){
                arr[2][i] = 1;
            }else{
                arr[2][i] = 2;
            }
        }
        if(n>2){
            for (int i = 3; i <=n ; i++) {
                for (int j = 1; j <=9 ; j++) {
                    if(j==1){
                        arr[i][j] = (arr[i-2][j] + arr[i-1][j-1]) %mod;
                    }else if(j==9) {
                        arr[i][j] = (arr[i-1][j-1])%mod;
                    }else {
                        arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) %mod;
                    }
                }
            }
        }

        for (int i = 1; i <=9 ; i++) {
            result = result + arr[n][i];
        }

        System.out.println(result%mod);
    }
}
