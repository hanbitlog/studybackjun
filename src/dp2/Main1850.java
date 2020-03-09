package dp2;

import java.util.Scanner;

public class Main1850 {
    public static long gcd(long n, long m){
        if(m==0) return n;
        return gcd(m, n%m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a= sc.nextLong();
        long b= sc.nextLong();
        for (int i = 0; i < gcd(a,b); i++) {
            System.out.print("1");
        }
    }

}
