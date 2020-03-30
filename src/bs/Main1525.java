package bs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1525 {

    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};
    private static Queue<Integer> queue;
    private static final int MAX = 10001;
    private static HashMap<Integer,Integer> map;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = 0;

        // 입력값을 한줄의 string으로 만든다.
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                int tmp = sc.nextInt();
                if(tmp ==0){
                    tmp=9;
                }
                start = start *10 +tmp;// 자리수를 한칸씩 이동하기 위해 10의배수로 처리리            }
            }
        }

        queue = new LinkedList<>();
        map = new HashMap<Integer, Integer>();

        queue.add(start);
        map.put(start, 0);
        // 처음 시작 점을 큐에 넣고 이동 시킴.
        // 193/425/786
        // 예를 들어 5를 찾아갈때 i*3+j 식을 활용하여 i가 1이고, j가 2라면 5를 찾아 갈수 있다.
        while (!queue.isEmpty()){
            // 9가 나오는 위치를 찾아서 위치를 찾고 해당 위치를 기준으로 x,y의 위치를 찾는다.
            // x,y의 위치를 찾은 뒤에 그 인데스로 9의 값을 이동시킨다.
            // 이동시키면서 9가 우측 하단으로 갈 수 있도록 계속해서 swap해준다.

            int nowNum = queue.remove();// 현재 위치 숫자 가져옴.
            String now = String.valueOf(nowNum);
            int nine = now.indexOf('9');// 9의 위치를 찾아서 움직일 것
            int x = nine/3;
            int y = nine%3;

            for (int k = 0; k <4 ; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if((nx >= 0 && nx<3) && (ny >= 0 && ny<3)){
                    // 상하좌우의 범위안에서 찾는다. 서로의 값 바꿔주는 부분
                    StringBuilder next = new StringBuilder(now);
                    char temp = next.charAt(x*3 +y);
                    next.setCharAt(x*3 +y, (char) next.charAt(nx*3 +ny));
                    next.setCharAt(nx*3 +ny, temp);
                    int num = Integer.parseInt(next.toString());

                    if(!map.containsKey(num)){
                        //현재 가지고 있는 count에서 +1
                        map.put(num, map.get(nowNum) +1);
                        queue.add(num);
                    }
                }
            }
        }
        if(map.containsKey(123456789)){
            System.out.println(map.get(123456789));
        }else{
            System.out.println("-1");
        }

    }
}
