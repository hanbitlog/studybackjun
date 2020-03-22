package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.*;

public class Main1707 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < k; i++) {
            System.out.println("------- start "+ i );
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.valueOf(st.nextToken());
            int e = Integer.valueOf(st.nextToken());
            System.out.println("v "+ v);
            System.out.println("e "+ e);

            List<Integer>[] lists = new ArrayList[v + 1];
            int[] colors = new int[v + 1];

            for (int j = i; j <= v; j++) {
                lists[j] = new ArrayList<Integer>();
            }

            for (int j = 0; j < e; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.valueOf(st.nextToken());
                int b = Integer.valueOf(st.nextToken());
                System.out.println("a "+ a);
                System.out.println("b "+ b);
                lists[a].add(b);
                lists[b].add(a);
            }
            boolean bipartilte = true;

            for (int j = 1; j <= v; j++) {
                if (colors[j] == 0) {
                    if (!bfsCheck(lists, colors, j)) {
                        bipartilte = false;
                        break;
                    }
                }
            }

            if (bipartilte) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }

        }
        System.out.println(sb);
    }

    private static boolean bfsCheck(List<Integer>[] lists, int[] color, int j) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(j);
        color[j] = 1;
        System.out.println("----- bfs start -----");
        while (!queue.isEmpty()) {
            int n = queue.poll();
            System.out.println("n "+ n);

            for (int elem : lists[n]) {
                System.out.println("elem "+ elem);
                System.out.println("color[elem] "+ color[elem]);
                System.out.println("color[n] "+ color[n]);
                if (color[elem] == 0) {
                    queue.offer(elem);
                    System.out.println("color[elem] before "+ color[elem]);
                    color[elem] = color[n] * -1;
                    System.out.println("color[elem] after "+ color[elem]);
                } else if (color[elem] != color[n] * -1) {
                    return false;
                }
            }
        }
        return true;
    }

}


