package io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        List<Integer> lista = new ArrayList<>();
        List<Integer> listb = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            lista.add(sc.nextInt());
            listb.add(sc.nextInt());
        }
        for(int j=0; j<lista.size(); j++){
            if(0<lista.get(j) && listb.get(j)<10){
                System.out.println(lista.get(j) + listb.get(j));
            }
        }
        sc.close();
    }
}
