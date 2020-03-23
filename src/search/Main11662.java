package search;

import java.util.Scanner;

public class Main11662 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double aX1 = sc.nextDouble();
        double aY1 = sc.nextDouble();
        double aX2 = sc.nextDouble();
        double aY2 = sc.nextDouble();

        double cX1 = sc.nextDouble();
        double cY1 = sc.nextDouble();
        double cX2 = sc.nextDouble();
        double cY2 = sc.nextDouble();
        // 오차가 10의 -6승까지
        int interval = 1000000;
        double aDX = (aX2-aX1)/interval;
        double aDY = (aY2-aY1)/interval;
        double cDX = (cX2-cX1)/interval;
        double cDY = (cY2-cY1)/interval;

        //시작점의 거리
        double min = getDistance(aX1, aY1, cX1, cY1);

        for (int i = 1; i <=interval ; i++) {
            double tmp = getDistance(aX1 + aDX*i, aY1+ aDY*i, cX1+cDX*i, cY1+cDY*i);

            if(tmp < min){
                min = tmp;
            }
        }
        System.out.println(min);
    }

    public static double getDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }


}

