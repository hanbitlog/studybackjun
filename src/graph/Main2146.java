package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Dot{
    int x ;
    int y ;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main2146 {
    public static final int[] dx ={0,0,-1,1};
    public static final int[] dy ={1,-1,0,0};
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n]; // 입력 받은 배열
        int[][] d = new int[n][n]; // 섬간의 거리 측정
        int[][] g = new int[n][n]; // 섬 그룹 번호매기기

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int count =0;
        /*섬 번호 매기기*/
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(a[i][j] ==1 && g[i][j] == 0){
                    Queue<Dot> queue = new LinkedList<Dot>();
                    g[i][j] = ++count;
                    queue.add(new Dot(i,j));
                    while(!queue.isEmpty()){
                        Dot p = queue.remove();
                        int x = p.x;
                        int y = p.y;
                        for (int k = 0; k <4 ; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];
                            if(0<=nx && nx<n && 0<=ny && ny<n){
                                if(a[nx][ny] ==1 && g[nx][ny] == 0){
                                    queue.add(new Dot(nx,ny));
                                    g[nx][ny]=count;
                                }
                            }

                        }
                    }

                }
            }

        }

        Queue<Dot> queue = new LinkedList<Dot>();
        /*거리재기위한 사전 단계(섬(0)과 육지(-1) 구분)*/
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                d[i][j] = -1;//섬이 아닌곳을 체크 하기 위해 -1로표시
                if(a[i][j] == 1){// 섬이기 때문에 큐에 넣고 0으로 바꾸자
                    queue.add(new Dot(i,j));
                    d[i][j]=0;
                }
            }
        }
        /*위에서 섬만 모아 놓은 큐를 활용하여 거리 측정 */
        while (!queue.isEmpty()){
            Dot p = queue.remove();
            int x = p.x;
            int y = p.y;
            for (int i = 0; i <4 ; i++) {
                int nx= x+dx[i];
                int ny= y+dy[i];
                if(0<=nx && nx<n && 0<=ny && ny<n){// 배열에 벗어나지 않는 범위에서
                    if(d[nx][ny] == -1){//섬 기준으로 상하좌우가 섬이 아닌곳이 거리 측정해야하는 곳임.
                        d[nx][ny] = d[x][y] +1;// 섬이 아닌곳으로 들어와서 d[][]에 임시로 만들어 놓았던 것에 +1, 즉, 0으로 만든다.
                        g[nx][ny] = g[x][y];// 섬의 영역 표시한 숫자로도 적어준다.
                        queue.add(new Dot(nx, ny));//bfs. 섬아닌 곳에 거리 측정해준 값들 모아두고 이따가 계산할꺼임.
                    }
                }
            }
        }
        /*마지막 !! d배열을 통해 거리를 계산하여 최솟값 구하는 곳 */
        int ans = -1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                for (int k = 0; k <4 ; k++) {
                    // 상하좌우 찍으면서, 본인자리의 값이랑 비교하는 값이랑 다르면 거리를 계산해야하는 지점임.
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if(0<=x && x<n && 0<=y && y<n){
                        if(g[i][j] != g[x][y]){
                            // 최솟값 ans이 -1이거나, 최소값보다 더 작은 경우가 나올 경우 바꿔준다.
                           if(ans == -1 || ans > d[i][j] + d[x][y]){
                               ans = d[i][j] + d[x][y];
                           }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}