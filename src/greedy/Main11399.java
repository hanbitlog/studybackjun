package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        int[] result = new int[n];
        result[0] = arr[0];
        for (int i = 1; i <n ; i++) {
            int tmp =arr[0];
            for (int j = 1; j <=i ; j++) {
                tmp += arr[j];
            }
            result[i] = tmp;
        }

        int sum =0;
        for (int i = 0; i <n ; i++) {
            sum += result[i];
        }
        System.out.println(sum);
    }
}
