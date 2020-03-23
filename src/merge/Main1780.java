package merge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1780 {
    static int size;
    static int[] count;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        size= Integer.parseInt(br.readLine());
        StringTokenizer st ;
        count = new int[3];
        arr = new int[size][size];
        for (int i = 0; i <size ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <size ; j++) {
                // 원소별 구분 및 바로 계산이 가능하도록 +1을 한다.
                arr[i][j]=Integer.parseInt(st.nextToken()) +1;
            }
        }
        divideAndConqure(0,0,size);

        System.out.println(count[0]);
        System.out.println(count[1]);
        System.out.println(count[2]);

    }


    private static boolean isAble(int r, int c , int len){
        int t = arr[r][c];

        //하나의 숫자랑 다른 원소들이 같은 경우 이지!
        for (int i = r; i < r+len; i++) {
            for (int j = c; j < c+len; j++) {
                if(t != arr[i][j])
                    return false;
            }
        }
        return true;
    }
    private static void divideAndConqure(int r, int c , int len){
        if(isAble(r,c,len)){
            count[arr[r][c]] +=1;
        }else{
            int newLen = len/3;
            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j <3 ; j++) {
                    divideAndConqure(r + newLen*i, c+newLen*j, newLen);
                }
            }
        }
    }

}
