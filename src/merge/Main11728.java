package merge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main11728 {
    static int[] resultarr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int asize = Integer.parseInt(st.nextToken());
        int bsize = Integer.parseInt(st.nextToken());
        int[] arra = new int[asize];
        int[] arrb = new int[bsize];
        resultarr = new int[asize+bsize];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <asize ; i++) {
            arra[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arra);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <bsize ; i++) {
            arrb[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrb);

        mergesort(arra, arrb);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <resultarr.length ; i++) {
            sb.append(resultarr[i] + " ");
        }
        System.out.println(sb.toString());
    }

    private static void mergesort(int[] arra , int[] arrb){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<= arra.length && j<=arrb.length){
            if(arra[i] > arrb[j]){
                resultarr[k++]= arra[i++];
            }else{
                resultarr[k++]= arra[j++];
            }
        }
        if(i> arra.length){
            while(j<=arrb.length){
                resultarr[k++] = arrb[j++];
            }
        }else{
            while(i<=arra.length){
                resultarr[k++] = arrb[i++];
            }
        }
    }
}

