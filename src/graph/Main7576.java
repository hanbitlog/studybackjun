package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class  Tomato{
    int x;
    int y;

    public Tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main7576 {

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1= br.readLine().split(" ");

        int m  = Integer.parseInt(str1[0]);
        int n  = Integer.parseInt(str1[1]);

        int[][] arr = new int[n][m];
        int[][] dist = new int[n][m];

        Queue<Tomato> queue = new LinkedList<>();
        for (int i = 0; i < n ; i++) {
            String[] str2 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = str2[j].charAt(0) - '0';
                if (arr[i][j] == 1) {// 익은 토마토들만 큐에 넣어준다.
                    queue.add(new Tomato(i, j));
                }
            }
        }
        System.out.println("확인 : "+ queue.size());
        System.out.println("확인 : "+ queue.peek().x + " "+ queue.peek().y);



        while(! queue.isEmpty()){
            //queue에 있는것을 체크하는 곳
            Tomato  tomato = queue.remove();
            int x = tomato.x;
            int y = tomato.y;
            System.out.println("queue start :: x " + x + ", y " + y);

            for (int i = 0; i <dx.length ; i++) {
                int nx = x+ dx[i];
                int ny = y+ dy[i];

                if(0 <= nx && nx < n && 0<=ny && ny < m){// 배열 범위 안에 있는 index만 처리
                    System.out.println(" arr[nx][ny]  "+arr[nx][ny] );
                    System.out.println(" dist[nx][ny]  "+dist[nx][ny] );
                    if(arr[nx][ny] ==0 && dist[nx][ny] == 0){
                        // 배열안에 값이 0인 경우(토마토가 익지 않은경우)는 1을 더해준다.
                        queue.add(new Tomato(nx, ny));
                        System.out.println("------ "+i + " nx "+ nx + ", ny " + ny);
                        System.out.println(" dist[x][y]  "+ dist[x][y] );
                        dist[nx][ny] = dist[x][y] + 1; // 모두 익지 않는 경우의수는 서로 더해가면 0이 나오기때문에 따로 처리 하지 않음
                        System.out.println(" dist[nx][ny]  "+dist[nx][ny] );
                    }
                }
//                System.out.println("element : " + queue.element());
            }

        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //
                ans = Math.max(ans, dist[i][j]);
            }
        }
        //모든게 0이면 -1 예외처리
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] ==0&& dist[i][j] ==0){
                    ans = -1;
                }
            }
        }
        System.out.println(ans);
    }

}

