package dp;

import java.util.Scanner;

public class Main1699 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //TOP-DOWN 방식으로 하려고 했지만 1이 여러번 들어갈 경우에는 처리를 못함.
//        int count = (int) Math.sqrt(num) +1;
//        System.out.println("count  " + count);
//        for (int i = count; i >= 0; i--) {
//            System.out.println("---  " + i);
//            int val = (int) Math.pow(i, 2);
//            System.out.println("num >> " + num);
//            System.out.println("val >> " + val);
//            if(num>0){
//                if(num >= val){
//                    num = num - val;
//                    result++;
//                }
//            }else{
//                break;
//            }
//            System.out.println("result >> " + result);
//        }
        //이것도 점화식으로 풀어야하는 거임.
        int d[] = new int[num+1];
        for (int i = 1; i <= num; i++) {
            d[i] = i;
            for (int j = 1; j*j <=i ; j++) {
                if(d[i] > d[i-j*j]+1){
                    d[i] = d[i-j*j]+1;
                }
            }
        }
        System.out.println(d[num]);
    }
}
