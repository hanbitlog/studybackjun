package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10451 {

    static ArrayList<Integer>[] list;
    static int size, count;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        for (int i = 0; i <total ; i++) {
            count =0;
            size = sc.nextInt();
            list = new ArrayList[size+1];
            check = new boolean[size+1];
            int result=0;


            for (int j = 1; j <= size ; j++) {
                list[j] = new ArrayList<Integer>();
            }
            for (int k = 1; k <= size ; k++) {
                int tmp = sc.nextInt();
                list[k].add(tmp);
                list[tmp].add(k);
            }
            for (int j = 1; j <=size ; j++) {
                if(!check[j]){
                    dfs(j);
                    count++;
                }
            }
            System.out.println(count);

        }

    }

    private static void dfs(int v ){
        if(check[v]){

            return;
        }

        check[v] = true; // 방문 체크

        for (int vv : list[v]) { // v에 연결된 노드 가져옴.
            if(!check[vv]){// 방문하지 않았으면 dfs 다시 돌려
                dfs(vv);
            }
        }

    }

}

