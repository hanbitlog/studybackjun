package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2178 {
    private static int N, M, count;

    private static int[][] arr;
    private static boolean[][] dist;

    private static int[] dx = {-1,1,0,0};
    private static int[] dy = {0,0,1,-1};


    private static void bfs(Position position){
        Queue<Position> queue= new LinkedList<Position>();
        queue.offer(position);
        dist[position.n][position.m]= true;

        while (!queue.isEmpty()){

            Position front = queue.poll();

            if(front.n == N -1 && front.m == M -1){// 마지막을 경우 return!
                System.out.println(front.count);
                return;
            }

            for (int i = 0; i <4 ; i++) {// 인접행렬 돌아다녀보자
                int newN = front.n + dx[i];
                int newM = front.m + dy[i];

                if((0<=newN && newN< N )&& (0<=newM && newM< M)){
                    if(arr[newN][newM] ==1 && !dist[newN][newM]){// 이동가능하며, 방문하지 않는 큐일 경우.
                        dist[newN][newM] = true; // 방문체크함.
                        queue.offer(new Position(newN, newM, front.count+1));// 큐에 넣어주고 카운트 올려줌.
                    }
                }
            }
            System.out.println("n : "+ queue.peek().n + " m : " + queue.peek().m);

        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        N = Integer.parseInt(tmp[0]);
        M = Integer.parseInt(tmp[1]);

        arr = new int[N][M];
        dist = new boolean[N][M];

        for (int i = 0; i < N; i++) {// 입력받은 배열 담기
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) -'0';
            }
        }
        bfs(new Position(0,0,1));

    }

    public static class Position{
        int n, m,count;

        public Position(int n, int m, int count) {
            this.n = n;
            this.m = m;
            this.count = count;
        }
    }

}

