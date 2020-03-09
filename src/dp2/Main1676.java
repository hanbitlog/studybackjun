package dp2;

import java.util.Scanner;

public class Main1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fac =1;
        int k = n/5;
        if(n==0 || n==1 || n==2 || n==3 || n==4 ){
            System.out.println(0);
        }else {
            System.out.println(k);
        }

    }

}
