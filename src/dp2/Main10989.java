package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10989 {
    public static void main(String[] args) throws IOException {
//      soulution1();
      soulution2();

    }
    public static void soulution1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        list.sort(null);
        for (int i = 0; i <n ; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void soulution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10000];
        for (int i = 0; i <N ; i++) {
            count[Integer.parseInt(br.readLine())-1]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <10000 ; i++) {
            for (int j = 0; j <count[i] ; j++) {
                sb.append(i+1).append("\n");
            }
        }
        System.out.println(sb);

    }


}
