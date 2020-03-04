package io;

import java.util.Scanner;

public class Main10991 {
    public static void oddstart(int start, int end, int count){
        for (int i = start; i <= end; i++) {
            if((i%2)==0){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void evenstart(int start , int end, int count){
        for (int i = start; i <= end; i++) {
            if((i%2)==0){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();

        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            if((i%2)==0){
                oddstart(n-i,n+i,n);
            }else{
                evenstart(n-i,n+i,n);
            }
        }

    }


}
