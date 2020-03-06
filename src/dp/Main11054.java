package dp;

import java.util.Scanner;

public class Main11054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n + 1];
        int dph[] = new int[n + 1];
        int dpl[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            num[i] = sc.nextInt();
            dph[i] = 1;
            dpl[i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (num[j] < num[i] && dph[j] >= dph[i]) {
                    dph[i] = dph[j] + 1;
                }
            }
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                if (num[j] < num[i] && dpl[j] >= dpl[i]) {
                    dpl[i] = dpl[j] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (dph[i]+ dpl[i] > max) max =dph[i]+ dpl[i];
        }
        System.out.println(max-1);
    }
}
