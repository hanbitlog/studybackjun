package bs;

import java.util.ArrayList;
import java.util.Scanner;


class xy{
    int x ;
    int y ;

    public xy(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main2580 {

    static int[][] check ;

    static ArrayList<xy> arrayList = new ArrayList<xy>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        check = new int[9][9];
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                check[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if(check[i][j] == 0){
                    arrayList.add(new xy(i,j)); // 배열의 xy 정보를 list에 저장
                }
            }
        }
        dfs (arrayList,0);
    }

    static private void dfs(ArrayList<xy> arr, int idx){

        if(idx == arrayList.size()) {// 다찾았으면 출력함.
            for (int i = 0; i <9 ; i++) {
                for (int j = 0; j <9 ; j++) {
                    System.out.print(check[i][j]+ " ");
                }
                System.out.println("");
            }
            System.exit(0);
        }

        for (int i = 1; i <10 ; i++) { //1~9까지 숫자가 적합한지 탐색
            if(checkRow(arr,idx,i) == true && checkCol(arr,idx,i) == true && checkBox(arr,idx,i) == true){
                // 적합하면 index에 그 숫자를 넣고
                check[arr.get(idx).x][arr.get(idx).y] = i;
                // i가 9인채로 반복문이 종료되게 되면 이전에 저 숫자 탐색색
                dfs(arr, idx+1);
            }

            if(i==9){ // check[][]배열 0으로 다시 셋팅
                check[arr.get(idx).x][arr.get(idx).y] = 0;
            }
        }
    }

    // 가로행 중복검사
    static boolean checkRow(ArrayList<xy> arr, int idx, int pro){
        for (int i = 0; i <9 ; i++) {
            if(arr.get(idx).y == i) continue; //빈칸은 건너뜀
            if(check[arr.get(idx).x][i] == pro) return false;//숫자가 이미 존재하면 false
        }
        return true;
    }

    //세로열 중복검사
    static boolean checkCol(ArrayList<xy> arr, int idx, int pro){
        for (int i = 0; i <9 ; i++) {
            if(arr.get(idx).x == i) continue;//빈칸은 건너뜀
            if(check[i][arr.get(idx).y] == pro) return false;//숫자가 이미 존재하면 false
        }
        return true;
    }

    static boolean checkBox(ArrayList<xy> arr, int idx, int pro){

        // 시작점
       int a = arr.get(idx).x/3;
        int b = arr.get(idx).y/3;
        a *= 3;
        b *= 3;

        for (int i = a; i <a+3 ; i++) {
            for (int j = b; j <b+3 ; j++) {
                if(i == arr.get(idx).x && j==arr.get(idx).y) continue;
                if(check[i][j]!=0 && check[i][j] == pro) return false;
            }
        }

        return true;
    }


}
    