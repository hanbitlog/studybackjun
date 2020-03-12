package dp2;

import java.util.Scanner;

public class Main10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String n = sc.nextLine();
            int small = 0;
            int large = 0;
            int num = 0;
            int blank = 0;
            for (int i = 0; i < n.length(); i++) {
//                System.out.println("-----  " + i);
                if(n.charAt(i) >= 65 && n.charAt(i) <=90){
                    large += 1;
                }else if(n.charAt(i) >= 97 && n.charAt(i) <=122){
                    small +=1;
                }else if(n.charAt(i) >= 46 && n.charAt(i) <=57){
                    num +=1;
                }else {
                    blank += 1;
                }
            }
            System.out.println(small + " " + large + " " + num + " " + blank);


        }




    }

}
