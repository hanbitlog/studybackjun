package dp2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int tmp =0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 1; i <=n ; i++) {
            arr.add(i);
        }
        while (!arr.isEmpty()){
            System.out.println("------------" + k);
            tmp = (tmp+k-1)%arr.size();
            System.out.println("확인1: " + tmp);
            System.out.println("확인2: " + k);
            System.out.println("확인3: " + arr.get(tmp));
            System.out.println("확인4: " + arr.toString());

            int a =arr.remove(tmp);
            System.out.println("확인4-1: " + a);
            result.add(a);
            System.out.println("확인5: " + arr.toString());
            System.out.println("확인6: " + result.toString());
        }
        System.out.print("<");
        for (int i = 0; i <n ; i++) {
            System.out.print(result.get(i));
            if(i!=n-1){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }

}
