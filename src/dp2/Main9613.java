package dp2;

import com.sun.org.apache.bcel.internal.generic.INEG;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main9613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            int count = sc.nextInt();
            int[] arr = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = sc.nextInt();
            }
            long sum = 0;
            for (int i = 0; i < count ; i++) {
                for (int j = i+1; j < count; j++) {
                    sum += getGcd(arr[i], arr[j]);
                }
            }
            System.out.println(sum);

        }



    }

    public static int getGcd(int a, int b){
        if(b==0){
            return a;
        }
        return getGcd(b,a%b);
    }

}
