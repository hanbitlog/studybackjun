package io;

import java.util.Scanner;

public class Main2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();
//        int half = count/2;
        for (int i = 0; i <count; i++) {
            int half = count-i;
            for (int j = 2; j <=half; j++) {
                System.out.print(" ");
            }
            int end = count + i;
            for (int k = half; k <=end; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}
