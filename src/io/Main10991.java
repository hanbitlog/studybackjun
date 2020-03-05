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
        for (int i = 1; i <= n-1; i++) {
            for (int j = i; j <=n-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i*2-1; k++) {
                if(k==1 || k==i*2-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int k = 1; k <= n*2-1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }


}
