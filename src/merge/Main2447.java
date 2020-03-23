package merge;

import java.util.Arrays;
import java.util.Scanner;

public class Main2447 {
    static String[][] stars;
    static int n ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        stars = new String[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                stars[i][j] = " ";
            }
        }
        makeStarArray(0,0,n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                sb.append(stars[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }


    private static void makeStarArray(int row, int col, int num ){

        if(num==1){
            stars[row][col] = "*";
            return;
        }

        int val = num/3;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(i==1 && j==1){// 같은경우는 넣지 않는다.
                }else{
                    makeStarArray(row+(val*i), col+(val*j), val);
                }
            }
        }
    }

}
