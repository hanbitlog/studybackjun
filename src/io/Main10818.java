package io;

import java.util.Scanner;

public class Main10818{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int min = 10000;
        int max = -10000;
        int[] num = new int[count];
        for (int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
            if(num[i] > max){ max=num[i]; }
            if(num[i] < min){ min=num[i]; }
        }
        System.out.println(min + " "+ max);
    }

}
