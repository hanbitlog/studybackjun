package dp2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp =0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> josepus = new ArrayList<Integer>();

        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(i+1);
        }
        while (!arr.isEmpty()) {
            tmp = (tmp+k-1)%arr.size();
            josepus.add(arr.remove(tmp));
        }

        System.out.print("<");
        for (int i = 0; i < n; i++) {
            System.out.print(josepus.get(i));
            if(i!=n-1){
                System.out.print(",");
            }
        }
        System.out.print(">");
    }

}
