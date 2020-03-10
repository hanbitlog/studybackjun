package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Integer.valueOf(st.nextToken());
        long m = Integer.valueOf(st.nextToken());
        long cnt2=0, cnt5=0;

        cnt2 = fivecount(n);
        cnt5 = twocount(n);

        cnt2 -= fivecount(n-m);
        cnt2 -= fivecount(m);

        cnt5 -= twocount(n-m);
        cnt5 -= twocount(m);

        System.out.print(Math.min(cnt2,cnt5));
    }

    public static long fivecount(long n ){
        long cnt = 0;
        for (int i = 5; i <=n ; i *=5) {
            cnt += n/i;
        }
        return  cnt;
    }

    public static long twocount(long n ){
        long cnt = 0;
        for (int i = 2; i <=n ; i *= 2) {
            cnt += n/i;
        }
        return  cnt;
    }



}
