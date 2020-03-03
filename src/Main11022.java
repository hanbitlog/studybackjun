import java.util.Scanner;

public class Main11022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            if(a>0 && b<10){
                System.out.println("Case #"+(i+1)+": "+a +" + "+b+" = "+(a + b));
            }
        }
        sc.close();
    }

}
