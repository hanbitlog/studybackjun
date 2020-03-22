package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pairs{
    int x ;
    int y ;

    public Pairs(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class Main4963 {

//    static int[] dx = {-1,1,0,0};
//    static int[] dy = {0,0,-1,1};

    static int[] dx = {0, 0, 1, -1, 1, -1,  1, -1};
    static int[] dy = {-1, 1, 0, 0, -1 , 1, 1, -1};

    static int[][] arr;
    static int[][] maps;

    /* DFS */
    private static void dfs(int x , int y , int count, int w, int h ){
        maps[x][y] = count;
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(0<=nx && nx < h && 0<=ny && ny < w){
                if(arr[nx][ny] ==1 && maps[nx][ny] == 0){
                    dfs(nx, ny, count, w, h);
                }
            }
        }
    }

    private static void bfs(int x , int y , int count, int w, int h){
        Queue<Pairs> queue = new LinkedList<Pairs>();
        queue.add(new Pairs(x,y));
        maps[x][y] =  count;
        while(!queue.isEmpty()){
            Pairs p = queue.remove();
            x = p.x;
            y = p.y;
            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(0<=nx && nx < h && 0<=ny && ny < w){
                    if(arr[nx][ny] ==1 && maps[nx][ny] == 0){
                        bfs(nx, ny, count, w, h);
                    }
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
             String[] tmp = br.readLine().split(" ");
             int w = Integer.parseInt(tmp[0]);
             int h = Integer.parseInt(tmp[1]);

             if(w==0 && h ==0)
                 break;

            arr = new int[h][w];

            for (int i = 0; i <h ; i++) {
                String[] tmpmap = br.readLine().split(" ");
//                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
//                    arr[i][j] = Integer.parseInt(st.nextToken());
                    arr[i][j] = Integer.parseInt(tmpmap[j]);
                }
            }

            int count = 0;
            maps = new int[h][w];

            for (int i = 0; i < h; i++) {
                for (int j = 0; j <w ; j++) {
                    if(arr[i][j] == 1 && maps[i][j] == 0){
                        bfs(i,j,++count, w,h);
                    }
                }
            }
            System.out.println(count);
        }
    }
}

