package bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

//class Node{
//    int x;
//    int y;
//
//    Node(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}

public class Main1261 {

    static int[][] map;
    static int[][] dist;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map =new int[N][M];
        dist =new int[N][M];
        visited = new boolean[N][M];
        // 거리계산시 나올 수 있는 최댓값 넣어두기
        for (int i = 0; i <N ; i++) {
            String input = br.readLine();
            for (int j = 0; j <M ; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        bfs(0,0);
    }

    private static void bfs(int x1, int y1){

        Deque<Node> queue = new LinkedList<>();
        queue.addLast(new Node(x1, y1));
        visited[0][0] = true;

        while (!queue.isEmpty()){
            Node newnode = queue.pollLast();
            int x = newnode.x;
            int y = newnode.y;
            System.out.println("--- " + x + " ----- "  +y);
            for (int i = 0; i <4 ; i++) {// 하나의 노드 기준으로 상하좌우 하나씩 체크
                // 상하좌우 비교하기위해 변수 선언
                int next_x = x + dx[i];
                int next_y = y + dy[i];
                System.out.println("next_x " + next_x + " next_y " + next_y );
                // 방문하지 않고, 좌표의 범위안에 있으면 진행
                if(next_x>=0 && next_y>=0 && next_x < N && next_y < M && !visited[next_x][next_y]){
                    System.out.println("map[next_x][next_y] " + map[next_x][next_y] + " dist[x][y] " + dist[x][y] );
                    if(map[next_x][next_y] == 0 ){ // 0이면 벽이 없어 바로 갈 수 있으므로, 경로의 우선순위로! 큐의 뒤에다가 놓는다.
                        dist[next_x][next_y] = dist[x][y];
                        queue.addLast(new Node(next_x, next_y));
                    }else {// 1이면 벽을 부수고 가야 한다. 경로의 후 순위로! 큐의 앞에다가 둔다.(큐는 무조건 뒤에서 출력하기 때문)
                        dist[next_x][next_y] = dist[x][y] +1;
                        queue.addFirst(new Node(next_x, next_y));
                    }
                    visited[next_x][next_y] = true;

                }else {
                    continue;
                }
            }
        }
        System.out.println(dist[N-1][M-1]);

    }
}
