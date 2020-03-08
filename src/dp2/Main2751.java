package dp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
            list.add(sc.nextInt());
        }
        //1.Bubble Sort-> 시간초과
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/
        //2. Selection Sort -> 시간초과

        /*int min =1000000;
        for (int i = 0; i < n; i++) {
            min = i;
            for(int j =i+1; j<n; j++){
                if(arr[j] < arr[min]){
                min = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min] =temp;
        }*/
//        Arrays.sort(arr);
        Collections.sort(list);
        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
            System.out.println(list.get(i));
        }

    }

}
