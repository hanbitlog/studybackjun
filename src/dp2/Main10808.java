package dp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 26; i++) {
            list.add(i, 0);
        }

        for (int i = 0; i <str.length() ; i++) {
            int index = str.charAt(i)-97;
            int value = list.get(index);
            list.set(index, value+1);
        }
        for (int i = 0; i <26 ; i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
