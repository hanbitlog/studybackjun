package dp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < n.length(); i++) {
            list.add(n.charAt(i));
        }
        long result = 0;
        int cnt = 0;

        for (int i = list.size() - 1; i >=0 ; i--) {
            int num =0;
            char ch = n.charAt(i);
            if(ch>='A' && ch <= 'Z')
                num = n.charAt(i)-55;
            else
                num = n.charAt(i)-'0';
            long temp1 = Character.getNumericValue(list.get(i));
            long temp2 = (long) Math.pow(b, cnt);
            System.out.println("temp1  >> " + temp1);
            System.out.println("temp1  비교>> " + num);
            System.out.println("temp2  >> " + temp2);
            result += temp1*temp2;
            cnt++;
            System.out.println("result  >> " + result);
        }
        System.out.println(result);

        }
    }


