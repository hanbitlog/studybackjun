package dp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6588 {
    public static List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = 1000000;
        Boolean[] isPrime = new Boolean[MAX+1];
        Boolean[] isNotPrime = new Boolean[MAX+1];

        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i < MAX; i++) {
            if(isNotPrime[i] ==  false){
                for (int j = i+i; j <=MAX ; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        //소수가 아닌걸 false로
        /*for (int i = 2; i < isPrime.length; i++) {
            for (int j = 2 ; i*j < isPrime.length ; j++) {
                isPrime[i*j]=false;
            }
        }*/

        /*for (int i = 2; i <=1000000 ; i++) {
            for (int j = i*2; j <=1000000 ; j++) {
                if(!isPrime[j]) continue;
                isPrime[j] = false;
            }
        }*/
        int a = 0;
        int b = 0;

        while (true){
            int n =sc.nextInt();
            if(n==0)
                break;
            for (int i = 3; i <n ; i++) {
                if(false == isPrime[i] ){
                    a = i;
                    if(false== isPrime[n-a] ){
                        b= n -a;
                        System.out.println(n +" = "+a+" + "+b);
                        break;
                    }
                }
            }

        }
    }

}
