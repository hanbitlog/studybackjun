package bs;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1107Sample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int m = sc.nextInt();
        int[] remocon = new int[10];

        for (int i = 0; i <m ; i++) {
            int val = sc.nextInt();
            remocon[val] = -1;
        }

        if(n.equals("100")){
            System.out.println(0);
        }else{
            int min = Integer.MAX_VALUE;
            String v = "";
            String closer = "";

            for (int i = 0; i <1000000 ; i++) {
                boolean isOk = true;
                v = i+"";
                for (int j = 0; j <v.length() ; j++) {
                    if(remocon[v.charAt(j)-'0'] == -1){
                        isOk=false;
                        break;
                    }
                }
                if(isOk){
                    if(min > Math.abs(Integer.parseInt(n) - Integer.parseInt(v))){
                        min = Math.abs(Integer.parseInt(n) - Integer.parseInt(v));
                        closer = v;
                    }
                }
            }

            int result1 = Math.abs(Integer.parseInt(n)-100);
            if(closer.equals("")){
                System.out.println(result1);
            }else {
                int result2 = Math.abs(Integer.parseInt(n) - Integer.parseInt(closer))+ closer.length();
                if(result1 > result2){
                    System.out.println(result2);
                }else {
                    System.out.println(result1);
                }
            }
        }
    }


}
