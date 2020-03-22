package graph;

import java.io.IOException;
import java.util.*;

public class Main2331 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(a,0);
        int cnt=1;
        int tmp =a;
        while(true){
            int D=0;
            while(tmp!=0){
                D += Math.pow(tmp%10, p);
                tmp /=10;
            }
            System.out.println("확인하세요 : "+D);
            if(map.containsKey(D)){
                System.out.println(map.get(D));
                return;
            }
            System.out.println("확인하세요 : "+map.toString());
            map.put(D,cnt++);
            tmp=D;

        }

    }


}
