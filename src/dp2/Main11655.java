package dp2;

import java.util.Scanner;

public class Main11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        Character[] strings= new Character[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == 32){
                strings[i] = str.charAt(i);
            }else if(str.charAt(i) >=48 && str.charAt(i) <=57 ){
                strings[i] = str.charAt(i);
            }else if(str.charAt(i) >=65 && str.charAt(i) <=90 ){
                //대문자
                if(str.charAt(i)+13 > 90){
                    strings[i] = Character.valueOf((char) (str.charAt(i)-13));
                }else {
                    strings[i] = Character.valueOf((char) (str.charAt(i)+13));
                }

            }else if(str.charAt(i) >=97 && str.charAt(i) <=122 ){
                //소문자
                strings[i] = str.charAt(i);
                if(str.charAt(i)+13 > 122){
                    strings[i] = Character.valueOf((char) (str.charAt(i)-13));
                }else {
                    strings[i] = Character.valueOf((char) (str.charAt(i)+13));
                }
            }
        }

        for (int i = 0; i <str.length() ; i++) {
            System.out.print(strings[i]);
        }



    }

}
