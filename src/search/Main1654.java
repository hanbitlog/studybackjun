package search;

import java.util.Scanner;

public class Main1654 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        long[] arr = new long[k];
        long max = 0;

        for (int i = 0; i <k ; i++) {
            arr[i] = sc.nextLong();
            max = Math.max(max, arr[i]);
        }

        long start =1;
        long end =max;

        while (start<=end){
            long count =0;

            long mid = (start+end)/2;

            for (int i = 0; i <k ; i++) {
                count += arr[i]/mid;
            }
            if(count < n){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(end);
    }
}