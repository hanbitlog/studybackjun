package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2667 {

    static int count, n;
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    static int[][] arr;
    static int[][] house;
    static ArrayList al = new ArrayList();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        house = new int[n][n];
        // 배열만들고
        for (int i = 0; i <n ; i++) {
            String[] tmp = br.readLine().split("");
            for (int j = 0; j <n ; j++) {
                arr[i][j] = tmp[j].charAt(0) - '0';
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {

                if(arr[i][j] ==1 && house[i][j]==0){
                    // 단지 array에 1이고, 아직 count를 안한 곳에만 단지번호 매기기
                    count = 1;
                    find(i,j);
                    al.add(count);
                }
            }

        }
        Collections.sort(al);

        System.out.println(al.size());
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));
        }
    }

    static int find (int x, int y){
        house[x][y] =1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx<n && ny < n ){
                if(arr[nx][ny] ==1 && house[nx][ny] == 0){
                    // 배열 범위 안에서 array에는 있는데 아직 단지번호를 안매기 경우, 재귀로 돌려서
                    // 1로 다채우고 그다음 count 하나 추가.
                    find(nx, ny);
                    count++;
                }
            }

        }
        return count;
    }
}
