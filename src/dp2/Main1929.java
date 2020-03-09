package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1929 {
    public static boolean[] primeNum;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());

        primeNum = new boolean[endNum+1];
        getPrimeNum();
        StringBuilder sb = new StringBuilder();
        for (int i = startNum; i <= endNum; i++) {
            //false 인것만 sb 에 모아요.
            if(!primeNum[i]){
                sb.append(i+"\n");
            }
        }
        System.out.println(sb.toString());

        br.close();
    }

    public static void getPrimeNum(){
        primeNum[1] =true;
        // 소수가 아닌것들만 true로 체크해둠.
        for (int i = 2; i < primeNum.length ; i++) {
            for (int j = 2; i*j < primeNum.length; j++) {
                primeNum[i*j] = true;
            }
        }
    }

}
