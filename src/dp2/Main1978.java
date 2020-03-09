package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1978 {
    static boolean[] check;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Boolean b = true;
        int count =0;

        for (int i = 0; i < num; i++) {
            int pNum = sc.nextInt();

            if(pNum <= 1)
                b=false;
            else {
                for (int j = 2; j <=pNum/2 ; j++) {
                    if (pNum %j ==0)
                        b=false;
                }
            }
            if (b)
                count++;
            b=true;
        }
        System.out.println(count);

    }



}
