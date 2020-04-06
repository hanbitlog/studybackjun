package bs;

import java.util.Arrays;
import java.util.Scanner;

public class Main7453 {
    static int[][] arr;
    static long[] arrab, arrcd;
    static long count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new int[n][4];

        arrab = new long[n*n];
        arrcd = new long[n*n];

        for (int i = 0; i <n ; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
        }

        // 두배열의 부분합 구하기
        int k =0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arrab[k] = arr[i][0] + arr[j][1];
                arrcd[k] = arr[i][2] + arr[j][3];
                k++;
            }
        }

        Arrays.sort(arrab);
        Arrays.sort(arrcd);

        int leftIdx = 0;
        int rightIdx = (n*n) -1;
        while (leftIdx < (n*n) && rightIdx>=0){// 전체 범위 제한둠

            long lv = arrab[ leftIdx];
            long rv = arrcd[rightIdx];

            if(lv+rv ==0){
                long lc = 0;
                while(leftIdx < arrab.length && arrab[leftIdx] == lv){
                    lc++;
                    leftIdx++;
                }
                long rc = 0;
                while(rightIdx >= 0 && arrcd[rightIdx] == rv){
                    rc++;
                    rightIdx--;
                }
                count += (rc*lc);
            }
            if(lv+rv>0){
                rightIdx--;
            }
            if(lv+rv<0){
                leftIdx++;
            }
        }
        // 4개의 배열을 모두 사용하여 만들었기 때문에 공집합인 경우는 없다.
        System.out.println(count);
    }
}
    