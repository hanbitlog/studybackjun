package search;

import java.util.Arrays;
import java.util.Scanner;

public class Main2805 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        System.out.println("m " + m +" n " +n);

        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        Arrays.sort(arr);

        int left =1;
        int right =arr[n-1];
        long height =0;
        int mid =0;
        int ans=0;

        while(left <= right){

            height =0;
            mid =(left+right)/2;

            for (int i = 0; i <n ; i++) {
                if(arr[i]>=mid) {
                    height += (arr[i] -mid);
                }
                System.out.println("i---- " + i + " height " + height);
            }
            /*if(height > m){
                ans = mid;
                left = mid + 1;
            }else  if(height < m){
                right = mid-1;

            }else{
                ans = mid;
                break;
            }*/
            if(height >= m){
//                ans = mid;
                left = mid + 1;
            }else  if(height < m){
                right = mid-1;

            }

            System.out.println(" right " + right + " left " + left + " mid " + mid);


        }
        System.out.println(right);



    }
}

