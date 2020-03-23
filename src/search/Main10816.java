package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10816 {
    static final int UPPER_MAX = 10000000;
    static final int MAX_ARRAY = (UPPER_MAX*2) +1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.valueOf(br.readLine());
        int[] checkCards = new int[MAX_ARRAY];

        StringTokenizer st  = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <cnt ; i++) {
            checkCards[Integer.valueOf(st.nextToken()) +UPPER_MAX]++;
        }
        cnt = Integer.valueOf(br.readLine());
        st  = new StringTokenizer(br.readLine());
        for (int i = 0; i <cnt ; i++) {
            sb.append(checkCards[Integer.valueOf(st.nextToken())+UPPER_MAX] + " ");
        }
        System.out.println(sb.toString());

    }


}

