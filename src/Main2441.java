import java.util.Scanner;

public class Main2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();
        for (int i = 1; i <=count; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <=count; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}
