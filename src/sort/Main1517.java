package sort;

import java.util.Scanner;

public class Main1517 {
    static int n;
    static long[] arr;
    static long[] arrcopy;
    static long count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new long[n];
        arrcopy = new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i] =sc.nextInt();
        }

        count =0;
        Merge(0,n-1);

        System.out.println(count);
    }

    private static void Merge(int left, int right){
        if(left != right){
            int mid =(left+right)/2;
            Merge(left, mid);
            Merge(mid+1, right);
            MergeSort(left,right);
        }
    }

    private static  void MergeSort(int left , int right){
        int mid =(left+right)/2;
        int i  = left;
        int j =  mid + 1;
        int k = left;

        //이제 합친다.
        while(i <= mid && j<=right){
            // i가 mid로 오고, j가 맨끝으로 가면 반복문을 멈춘다.
            if(arr[i] > arr[j]){ // 왼쪽 있는 배열이 더 크면 더작은 오른쪽에 있는 배열을 arrcopy에 담는다.
                arrcopy[k++]=arr[j++];
                count+= mid-i+1;
            }else {
                // 반대의 경우
                arrcopy[k++] =  arr[i++];
            }
        }

        if(i>mid){ //오른쪽에 배열이 남은 경우
            while(j<=right){
                arrcopy[k++] = arr[j++];
            }
        }else{// 왼쪽에 배열이 남은 경우.
            while(i<=mid){
                arrcopy[k++] = arr[i++];
            }
        }


        //arrcopy에 담아놓은 배열을 arr배열에 다시 담는다.
        for (int h = left; h <= right ; h++) {
            arr[h] = arrcopy[h];
        }


    }


}

