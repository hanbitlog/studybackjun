import java.util.Scanner;

public class Main11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str = sc.next();
        String[] strings = str.split("");
        int result = 0;
        for (int i = 0; i < count; i++) {
            result = result + Integer.valueOf(strings[i]);
        }
        System.out.println(result);
        sc.close();
    }
}
