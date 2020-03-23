package merge;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main2261 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Point[] points = new Point[n];
        StringTokenizer st;
        for (int i = 0; i <n ; i++) {
            st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        // 최소 거리 구하기 하기 위해 x축 기준으로 정렬
        Arrays.sort(points, (a,b)->(a.x - b.x));
        TreeSet<Point> set = new TreeSet<>((a,b) -> ((a.y == b.y) ? a.x-b.x : a.y - b.y));
        set.add(points[0]);//기준
        set.add(points[1]);
        // 기준이 되는 0과 가장 가까운 1의 거리를 구한다.
        long answer = distSquare(points[0], points[1]);
        int start =0;
        for (int i = 2; i < n ; i++) {
            Point cur = points[i];
            while (start<i){
                Point point = points[start];//처음 시작
                long x = cur.x - point.x;
                if(x*x > answer){
                    set.remove(point);
                    start +=1;
                }else {
                    break;
                }
            }
            int d = (int) Math.sqrt((double) answer) +1;
            Point from = new Point(-10001, cur.y-d);
            Point to = new Point(10001, cur.y+d);
            for (Point point: set.subSet(from,to)) {
                long distance=distSquare(cur, point);
                answer= Math.min(answer, distance);
            }
        }
        System.out.println(answer);
    }

    private static long distSquare(Point A, Point B){
        return (long) ((A.x - B.x)*(A.x - B.x) + (A.y - B.y)*(A.y - B.y));
    }
}
class Point{
    int x;
    int y ;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
