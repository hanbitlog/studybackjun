package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;


public class Main10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader  bf = new BufferedReader(new InputStreamReader(System.in));
        char[] tmp = bf.readLine().toCharArray();
        int[] arr = new int[tmp.length];

        // 문자열을 int형 배열에 담아준다.
        for (int i = 0; i < tmp.length ; i++) {
            arr[i]=tmp[i]-'0';
        }

        // 10의 배수인지 체크
        boolean isThirth = false;
        // 3의 배수는 자리수의 숫자를 모두 더해서 3으로 나눠지면 3의배수임.
        int sum = 0;

        // 자리수 더하기 & 10의 배수 판별
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];

            if(arr[i] == 0){
                isThirth = true;
            }
        }

        if(sum %3 !=0 | !isThirth){
            // 3의 배수가 아니거나 10배수가 아닌 경우.
            System.out.println(-1);
        }else {
            // 3의배수이면서 10의배수인경우 가장 큰수를 출력하기위해 뒤에서부터 출력
           Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for (int i = arr.length-1; i >=0 ; i--) {
                sb.append(arr[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
