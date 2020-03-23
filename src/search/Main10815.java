package search;

import java.util.Arrays;
import java.util.Scanner;

public class Main10815 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long[] arra = new long[a];
        for (int i = 0; i <a ; i++) {
            arra[i] =sc.nextLong();
        }
        int b = sc.nextInt();
        long[] arrb = new long[b];
        for (int i = 0; i <b ; i++) {
            arrb[i] =sc.nextLong();
        }
        Arrays.sort(arra);
        

        int ans =0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <b ; i++) {
            int left = 0;
            int right= a-1;
            long val = arrb[i];
            int mid =0;
//            System.out.println("----- " + val);
            while(left<=right){
                mid =(left+right)/2;
//                System.out.println("mid "+ mid + " arra[mid] " + arra[mid] + " val " + val);
                if(arra[mid]>val){
                    right = mid-1;
                    ans = 0;
                }else if(arra[mid]<val) {
                    left = mid+1;
                    ans = 0;
                }else{
                    ans = 1;
                    break;
                }

            }
            sb.append(ans+" ");
        }
        System.out.print(sb);

    }
}

