package dp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        List<Character> list =new ArrayList<>();

        while (n>0){
            System.out.println("---- " + n);
            if(n%b <10){
                System.out.println("n%b " + (n%b)) ;
                System.out.println("n%b " + (n%b+'0')) ;
                list.add((char) (n%b+'0'));
            }else {
                System.out.println("n%b 1 >> " + (n%b)) ;
                System.out.println("n%b 2 >> " + (n%b-10)) ;
                System.out.println("n%b 3 >> " + (n%b-10+'A')) ;
                list.add((char) (n%b-10+'A'));
            }
            n /= b;
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i));
        }

    }

}
