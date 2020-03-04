package io;

import java.util.Scanner;

public class Main2739 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();

        for (int i = 1; i < 10; i++) {
            System.out.print(count + " * " + i + " = "+ (count*i));
            System.out.println();
        }
    }
}
