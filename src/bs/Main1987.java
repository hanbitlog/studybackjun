package bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


class Node{
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main1987 {

    static char[][] map;
//    static int[][] dist;
//    static boolean[][] visited;
    static boolean[] visitcheckdfs;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int R, C;
    static int ans =1;
    static int cnt =1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map =new char[C][R];
//        dist =new int[C][R];
//        visited = new boolean[C][R];
        visitcheckdfs = new boolean[26];
        // 거리계산시 나올 수 있는 최댓값 넣어두기
        for (int i = 0; i < C; i++) {
            String input = br.readLine();
            for (int j = 0; j < R; j++) {
//                map[i][j] = input.charAt(j);
                map[i][j] = (char) (input.charAt(j) - 'A');
            }
        }

//        bfs(0,0);
        dfs(map, visitcheckdfs, 0,0);
        System.out.println(ans);
    }
   /* private static void bfs(int x1, int y1){

        Deque<Node> queue = new LinkedList<>();
        queue.addLast(new Node(x1, y1));
        visited[0][0] = true;

        while (!queue.isEmpty()){
            Node newnode = queue.pollLast();
            int x = newnode.x;
            int y = newnode.y;
            char tmpxy = map[x][y];
//            System.out.println("--- " + x + " ----- "  +y);
            for (int i = 0; i <4 ; i++) {// 하나의 노드 기준으로 상하좌우 하나씩 체크
                // 상하좌우 비교하기위해 변수 선언

                int next_x = x + dx[i];
                int next_y = y + dy[i];

//                System.out.println("next_x " + next_x + " next_y " + next_y );
                // 방문하지 않고, 좌표의 범위안에 있으면 진행
                if(next_x>=0 && next_y>=0 && next_x < C&& next_y < R && !visited[next_x][next_y]){

                    char tmpnextxy = map[next_x][next_y];
//                    System.out.println("map[next_x][next_y] " + map[next_x][next_y] + " dist[x][y] " + dist[x][y] );
                    if(tmpxy == tmpnextxy ){
                        dist[next_x][next_y] = dist[x][y];
                        queue.addLast(new Node(next_x, next_y));
                    }else {
                        dist[next_x][next_y] = dist[x][y] +1;
                        queue.addFirst(new Node(next_x, next_y));
                    }
                    visited[next_x][next_y] = true;

                }else {
                    continue;
                }
            }
        }
        System.out.println(dist[C -1][R -1] +1);

    }*/

    private static void dfs(char[][] map, boolean[] visited , int x, int y){
        int idx = map[x][y];
        visited[idx] = true;

        for (int i = 0; i <4 ; i++) {
            int next_x = x + dx[i];
            int next_y = y + dy[i];
            if(next_x>=0 && next_y>=0 && next_x < C&& next_y < R ){
                int tmpnextxy = map[next_x][next_y];
                if(!visitcheckdfs[tmpnextxy]){
                    ans = Math.max(++cnt, ans);
                    dfs(map, visitcheckdfs, next_x, next_y);
                }
            }
        }
        --cnt;
        visitcheckdfs[idx] = false;
    }

}
