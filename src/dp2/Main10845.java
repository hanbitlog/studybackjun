package dp2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            String str = sc.next();

            if(str.equals("push")){
                queue.addLast(sc.nextInt());

            }else if(str.equals("pop")){
                if(queue.size()<1){
                    System.out.println(-1);
                }else {
                    int a = queue.pollFirst();
                    System.out.println(a);
                }
            }else if(str.equals("size")){
                System.out.println(queue.size());
            }else if(str.equals("empty")){
                if (queue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(str.equals("front")){
                if(queue.size()<1){
                    System.out.println(-1);
                }else {
                    System.out.println(queue.peekFirst());
                }
            }else if(str.equals("back")){
                if(queue.size()<1){
                    System.out.println(-1);
                }else {
                    System.out.println(queue.peekLast());
                }
            }
        }



    }
}
