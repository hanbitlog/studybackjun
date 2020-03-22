package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main11724 {
    static boolean check[];
    static ArrayList<Integer>[] list ;
    static int node, edge, count;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        node = sc.nextInt();
        edge = sc.nextInt();

        list = new ArrayList[node+1];
        check = new boolean[node+1];

        for (int i = 1; i <=node; i++) {
            list[i] = new ArrayList<>();
        }

        for (int j = 1; j <=edge ; j++) {
            int n = sc.nextInt();
            int e = sc.nextInt();

            list[n].add(e);
            list[e].add(n);
        }

        for (int i = 1; i <=node; i++) {
            System.out.println("---- i " + i + " " +  check[i]);
            if(!check[i]){
                System.out.println("----dfs--- ");
                count++;
                dfs(i);
            }
        }
        System.out.println(count);

    }

    private static void dfs(int x) {

        if(check[x]){
            return;
        }
        check[x] = true;
        for (int val: list[x]) {
            if(!check[val]){
                dfs(val);
            }
        }

    }



}
