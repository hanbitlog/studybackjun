import java.util.Scanner;

public class Main2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();
        for (int i = 1; i <=count; i++) {
            for (int j = 1; j <=count-i; j++) {
                System.out.print(" ");
            }
            for (int j = count-i+1; j <=count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
