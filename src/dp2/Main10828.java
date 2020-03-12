package dp2;

import java.util.Scanner;
import java.util.Stack;

public class Main10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        String str;
        for (int i = 0; i <n ; i++) {
            str = sc.next();
            System.out.println("--------- " +i + " :: "+str);
            if(str.startsWith("push")){
                stack.push(sc.nextInt());
            }else if(str.equals("pop")){
                if(stack.size()<1){
                    System.out.println(-1);
                }else {
                    int a = stack.pop();
                    System.out.println(a);
                }

            }else if(str.equals("size")){
                System.out.println(stack.size());

            }else if(str.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }else if(str.equals("top")){
                if(stack.size()<1){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
    }

}
