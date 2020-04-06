package bs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1208 {
    static int N, S;
    static long count=0;
    static int[] arr;
    static ArrayList<Integer> leftList = new ArrayList<>();
    static ArrayList<Integer> rightList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        S= sc.nextInt();
        arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] =  sc.nextInt();
        }


        // 반으로 나눠서 우선 배열의 합을 구한다.

        makeSum(0,0,N/2, leftList); // 왼쪽 배열의 합을 모은 리스트

        makeSum(0,N/2,N,  rightList); // 오른쪽 배열의 합을 모은 리스트

        Collections.sort(leftList);
        Collections.sort(rightList);

        int leftidx = 0;
        int rightidx = rightList.size() -1;

        while (leftidx < leftList.size() && rightidx >=0){

            long lv = leftList.get(leftidx);
            long rv = rightList.get(rightidx);

            if(lv + rv == S){ //합 S를 만드는 숫자가 여러개일 경우 count에 더해준다.

                long lc = 0;
                while(leftidx<leftList.size() && leftList.get(leftidx) == lv){
                    lc ++;
                    leftidx++;
                }

                long rc = 0;
                while(rightidx>=0 && rightList.get(rightidx) == rv){
                    rc++;
                    rightidx--;
                }
                count += rc*lc;
            }
            if(lv+rv > S) {
                rightidx--;
            }
            if(lv+rv < S) {
                leftidx++;
            }
        }

        if(S==0){// count 합이 0인 경우 공집합도 포함되므로 그 수를 하나 빼주고 출력
            count--;
        }
        System.out.println(count);


    }

    public static void makeSum(int sum, int idx, int endidx, ArrayList<Integer> list){

        if(idx >= endidx){
            list.add(sum);
            return;
        }
        makeSum(sum, idx+1, endidx, list);
        makeSum(sum+arr[idx], idx+1, endidx, list);

//        System.out.println("sum  "+sum+" idx "+idx+" endidx " +endidx + " list "+list.toString() );
    }
}
