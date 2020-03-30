package bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main2143 {

    static int N,M;
    static long T;
    static long arr1[], arr2[];
    static long cnt=0;
    static ArrayList<Long> arrList1 = new ArrayList<>();
    static ArrayList<Long> arrList2 = new ArrayList<>();
    static int count =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Long.parseLong(br.readLine());
        N = Integer.parseInt(br.readLine());
        arr1 = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <N ; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        arr2 = new long[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <M ; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        // 1. 부분합을 만들어 놓는다.
        for (int i = 0; i <N ; i++) {
            long sum =0;
            for (int j = i; j <N ; j++) {
                sum += arr1[j];
                arrList1.add(sum);
            }
        }
        for (int i = 0; i <M ; i++) {
            long sum =0;
            for (int j = i; j <M ; j++) {
                sum += arr2[j];
                arrList2.add(sum);
            }
        }

        Collections.sort(arrList1);
        Collections.sort(arrList2);

        int left =0;
        int right = arrList2.size()-1;

        for (int i = 0; i <arrList1.size() ; i++) {
            long val = T-arrList1.get(i);
            count += upper_bound(0, arrList2.size(), val) - lower_bound(0, arrList2.size(), val);
        }
        System.out.println(count);
    }
    public static int lower_bound(int left, int right, long target){
        while (left<right){
            int mid = (left+right)/2;
            if(arrList2.get(mid) < target){
                left = mid +1;
            }else {
                right = mid;
            }
        }
        return right;
    }

    public static int upper_bound(int left, int right, long target){
        while(left <right) {
            int mid = (left+right)/2;
            if(arrList2.get(mid) <= target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return right;
    }
}

