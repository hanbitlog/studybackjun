package dp2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        for (int i = 0; i <n ; i++) {
            String str = sc.next();
            if(str.equals("push_front")){
                deque.addFirst(sc.nextInt());
            }else if(str.equals("push_back")){
                deque.addLast(sc.nextInt());
            }else if(str.equals("pop_front")){
                if(deque.size()<1){
                    System.out.println(-1);
                }else {
                    System.out.println(deque.pollFirst());
                }
            }else if(str.equals("pop_back")){
                if(deque.size()<1){
                    System.out.println(-1);
                }else {
                    System.out.println(deque.pollLast());
                }
            }else if(str.equals("size")){
                System.out.println(deque.size());
            }else if(str.equals("empty")){
                if(deque.isEmpty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }else if(str.equals("front")){
                if(deque.size()<1){
                    System.out.println(-1);
                }else {
                    System.out.println(deque.peekFirst());
                }
            }else if(str.equals("back")){
                if(deque.size()<1){
                    System.out.println(-1);
                }else {
                    System.out.println(deque.peekLast());
                }

            }
        }

    }

}
