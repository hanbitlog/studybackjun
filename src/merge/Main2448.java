package merge;

import java.util.Scanner;

public class Main2448 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String[]map = new String[n];
        map[0] =  "  *  ";
        map[1] =  " * * ";
        map[2] =  "*****";
        for (int i = 1; 3*(int)Math.pow(2,i) <=n ; i++) {
            makeBigStar(i,map);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(map[i]);
        }
    }

    private static void makeBigStar(int k , String map[]){

        int bottom= 3*(int)Math.pow(2,k);
        int middle = bottom/2;
        System.out.println("k " + k + " bottom " + bottom + " middle " + middle);
        for (int i = middle; i <bottom ; i++) {
            System.out.println("--- i "+ i);
            System.out.println(map[i]);
            map[i] = map[i -middle] + " " + map[i -middle];
            System.out.println(map[i]);
        }
        String space="";
        while (space.length()< middle){
            space += " ";
        }
        for (int i = 0; i < middle ; i++) {
            map[i] =space + map[i] + space;
        }
    }

}
