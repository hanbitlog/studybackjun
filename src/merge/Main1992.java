package merge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1992 {
    private static int n , m;
    private static int map[][];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.valueOf(br.readLine());
        map = new int[n][n];
        int[] num = new int[n];
        StringTokenizer st =null;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j <n ; j++) {
                map[i][j] = Integer.valueOf(str.substring(j, j+1));
            }
        }
        divide(0,0,n);
    }

    private  static boolean check(int row, int col, int n ){
        int std = map[row][col];
        for (int i = row; i <row+n ; i++) {
            for (int j = col; j <col+n ; j++) {
                if(std != map[i][j]){
                    return false;
                }
            }
        }
        m=std;
        return true;
    }

    private static void divide(int row, int col, int n ){
        if(check(row, col, n)){
            System.out.print(m);
        }else{
            System.out.print("(");
            int s =n/2;
            for (int i = 0; i <2 ; i++) {
                for (int j = 0; j <2 ; j++) {
                    divide(row+s*i, col+s*j, s);
                }
            }
            System.out.print(")");
        }
    }


}
