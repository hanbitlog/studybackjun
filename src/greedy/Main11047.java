package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = n-1; i >=0 ; i--) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count =0;
        int idx = 0;
        while (k >0){
            int money = arr[idx];
            if(money <= k){
                count += k/money;
                k =k%money;
            }
            idx++;
            System.out.println("idx " +idx+" k " + k + " money " + money + " count " + count);

        }
        System.out.println("?????????");
        System.out.println(count);
        
    }
}
