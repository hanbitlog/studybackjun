package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2751 {

    public static int partition(int[] array, int left, int right) {//구분점을 만드는 메소드
        int mid = (left + right) /2;//중앙값을 첫번째와 교환하기 위해서
        swap(array, left, mid); // 중앙값을 첫번째 요소로 이동

        int pivot = array[left]; // 첫번째 인덱스(중앙값과 swap된)가 pivot이 됨.

        int i = left, j=right;

        while (i < j){// left < right 즉, 교체하기 전까지 반복.
            while (pivot < array[j]) {// j는 오른쪽에서 왼쪽으로 피봇보다 작거나 같은값을 찾는다.
                j--; // 찾지못하면 왼쪽으로 이동
            }
            while (i<j && pivot >= array[i]) {//i는 왼쪽에서 오른쪽으로 피봇보다 큰 값을 찾는다.
                i++; //찾지못하면 오른쪽으로 이동하면서 계속 찾으러감.
            }
            swap(array, i, j); //찾은 경우 i와 j 값을 교환

        }
        //반복문을 벗어난 경우 i와 j가 만난 경우
        //pivot과 교환
        array[left] = array[i]; // 어차피 i와 j가 만나기 때문에 i또는 j를 사용하면 됨.
        array[i] = pivot;// array[left]값을 담아 둔 pivot을 구분점의 요소에 저장.
        return i; // 구분점이 되는 인덱스를 반환

    }
    public static void swap(int[] array, int a, int b){
       int temp = array[b];
       array[b] = array[a];
       array[a] = temp;
    }

    public static void quicksort(int[] array, int left, int right){
        if(left >= right){
            return;
        }

        int pi = partition(array, left, right);
        quicksort(array, left, pi-1);
        quicksort(array, pi+1, right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n];
//        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(br.readLine());
//            list.add(sc.nextInt());
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
//        Collections.sort(list);

        //3. 마지막 퀵소트
        quicksort(arr, 0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
//            System.out.println(list.get(i));
        }

    }

}
