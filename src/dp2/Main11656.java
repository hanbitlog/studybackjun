package dp2;

import java.util.Arrays;
import java.util.Scanner;

public class Main11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int count = str.length();
        String[] strings= new String[str.length()];
        for (int i = 0; i <count ; i++) {
            strings[i] = str.substring(i, count);
        }
        Arrays.sort(strings);

        for (int i = 0; i <count; i++) {
            System.out.println(strings[i]);
        }


    }

}
