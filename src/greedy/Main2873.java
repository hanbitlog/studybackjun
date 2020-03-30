package greedy;

import java.util.Scanner;

public class Main2873 {

    public static void append(StringBuilder sb, char c, int count){
        for (int i = 0; i <count ; i++) {
            sb.append(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        StringBuilder s = new StringBuilder();

        if(n%2 ==1){// n이 홀수인 경우
            for (int i = 0; i <n ; i++) {
                if(i%2 ==0){
                    append(s,'R', m-1);
                    if(i != n-1){// 마지막엔 내려가지말고 오른쪽으로!
                        append(s,'D', 1);
                    }
                }else {
                    append(s,'L', m-1);
                    append(s,'D', 1);
                }
            }
        }else if(m%2 ==0){// m이 홀수인 경우
            for (int j = 0; j < m; j++) {
                if(j%2 ==0){
                    append(s,'D',n-1);
                    if(j != m-1){
                        append(s, 'R', 1);
                    }
                }else {
                    append(s,'U',n-1);
                    append(s,'R',1);
                }
            }
        }else{// n,m 둘다 짝수인경우
            int x, y;
            x = 0;
            y = 1;
            // 검정칸 중에서 제일 작은 수를 찾음.
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j < m; j++) {
                    if((i+j)%2 ==1){
                        if(arr[x][y] > arr[i][j]){
                            x=i;
                            x=j;
                        }
                    }
                }
            }
            int x1=0;
            int y1=0;
            int x2 = n-1;
            int y2= m-1;
            StringBuilder s2 =new StringBuilder();
            while(x2-x1 > 1){ // 시작점과 도착점에 인접한 2줄 검정칸이 없다면 지우기 \
                if(x1/2 < x/2){
                    append(s,'R',m-1);
                    append(s,'D',1);
                    append(s, 'L', m-1);
                    append(s,'D', 1);
                    x1 += 2;
                }
                if(x/2 < x2/2){
                    append(s2,'R',m-1);
                    append(s2,'D',1);
                    append(s2, 'L', m-1);
                    append(s2,'D', 1);
                    x2 -= 2;
                }
            }
            while (y2-y1 >1){
                if(y1/2 < y/2){
                    append(s,'D',1);
                    append(s,'R',1);
                    append(s,'U',1);
                    append(s,'R',1);
                    y1 += 2;
                }
                if(y/2 < y2/2){
                    append(s2,'D',1);
                    append(s2,'R',1);
                    append(s2,'U',1);
                    append(s2,'R',1);
                    y2 -= 2;
                }
            }

            if(y==y1){
                append(s,'R',1);
                append(s,'D',1);
            }else {
                append(s,'D',1);
                append(s,'R',1);

            }
            s2.reverse();
            s.append(s2);
        }
        System.out.println(s);
    }
}

