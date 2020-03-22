package graph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1967 {

    static int v,u, r;
    static ArrayList<Node>[] adj;
    static int[] dist;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

       adj = (ArrayList<Node>[]) new ArrayList[10001];// 문제 조건 주어짐.
       dist = new int[10001]; // 현재 정점까지의 거리의 합. 가중치의 합

        for (int i = 0; i <=10000 ; i++) { // 노드 리스트를 만들어놓자.
            adj[i] = new ArrayList<>();
        }
        int n = sc.nextInt();
        for (int i = 0; i <n-1 ; i++) { // 그래프 생성
            int parent = sc.nextInt();
            int child = sc.nextInt();
            int weight = sc.nextInt();

            adj[parent].add(new Node(child, weight));
            adj[child].add(new Node(parent, weight));
        }

        dfs(1,0);// 처음부터 가중치가 가장 큰 노드를 찾고
        // 다시 리셋후후그 찾은 노드로 가중치를 더하여 가장 긴경로의 dist를 찾는다.
        r=0;
        dist = new int[10001];
        dfs(u,0);
        System.out.println(r);
    }

    private static void dfs(int v, int d){
        dist[v] =d;

        if(dist[v] > r){
            r = dist[v];
            u = v;
        }

        for (Node node :  adj[v]){
            int next = node.v;
            int weight = node.w;

            if(dist[next] == 0){
                dfs(next, d + weight);
            }
        }
    }
    public static class Node{
        int v;
        int w;

        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

}

