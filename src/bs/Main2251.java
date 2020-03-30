package bs;

import java.util.Scanner;

public class Main2251 {

    static boolean[][] visited = new boolean[201][201];
    static boolean[] ans = new boolean[201];
    static int a,b,c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        dfs(0,0,c);
        for (int i = 0; i <201 ; i++) {
            if(ans[i]){
                System.out.println(i + " ");
            }
        }
    }

    private static void  dfs(int va, int vb, int vc){
        if(visited[va][vb]){
            return;
        }

        if(va==0){
            ans[vc] = true;
        }

        // 상관없는 칸은 0으로
        // a--->b
        if(va + vb > b){
            dfs((va+vb)-b, b, vc);
        }else {
            dfs(0,va+vb, vc);
        }
        // b--->a
        if(va + vb > a){
            dfs(a, (va+vb)-a, vc);
        }else {
            dfs(va+vb,0, vc);
        }
        // c--->a
        if(va + vc > a){
            dfs(a, vb, (vc+va)-a);
        }else {
            dfs(vc+va, vb, 0);
        }

        // c--->b
        if(va + vc > b){
            dfs(va, b, (vc+vb)-b);
        }else {
            dfs(va, vc+vb, 0);
        }
        // a--->c
        dfs(va,0,vb+vc);
        // b--->c
        dfs(0,vb,va+vc);

    }


}
    