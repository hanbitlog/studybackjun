import java.util.Scanner;

public class Main10953 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String line = sc.next();
            String[] str = line.split(",");
            System.out.println(Integer.valueOf(str[0]) + Integer.valueOf(str[1]));
        }
        sc.close();
    }

}
