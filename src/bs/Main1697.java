package bs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1697 {

    private static int start;
    private static int end;

    private static int[] visited;

    private static int res=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();
        visited = new int[100001];
        bfs();
        System.out.println(visited[end]);
    }
    private static void bfs(){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        while (!queue.isEmpty()){
            int n = queue.poll();
            if(n==end) break;
            if(n > 0 && visited[n-1] ==0){
                queue.offer(n-1);
                visited[n-1] = visited[n]+1;
            }
            if(n<100000 && visited[n+1]==0){
                queue.offer(n+1);
                visited[n+1] = visited[n] +1;
            }
            if(n*2<=100000 && visited[n*2]==0){
                queue.offer(n*2);
                visited[n*2] = visited[n] +1;
            }
        }
    }
}
