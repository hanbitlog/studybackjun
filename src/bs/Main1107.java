package bs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char[] inputs = sc.nextLine().toCharArray();
        /*for (int i = 0; i < inputs.length; i++) {
            System.out.println(inputs[i]-'0');
        }*/
        int count =0;
        int inputsum =0;
        int outputsum =0;

        int k =0;
        for (int i = inputs.length-1; i >=0 ; i--) {
            inputsum += (inputs[k]-'0')*Math.pow(10,i);
            k++;
        }
        // 100이면 안움직여도됨.
        if(inputsum == 100){
            System.out.println(count);
            return;
        }else{
            int m = sc. nextInt();
            if(m>0){

                List<Integer> remocon = new ArrayList<Integer>();

                for (int i = 0; i <10 ; i++) {
                    remocon.add(i);
                }

                // 고장난건 remocon에서 지우고
                for (int i = 0; i <m ; i++) {
                    int val = sc.nextInt();
                    remocon.remove((Integer) val);
                }


                // output 배열에 담아 준다.
                int[] output = new int[inputs.length];
                for (int i = 0; i <inputs.length ; i++) {
                    int num =9;
                    int inx =0;
                    for (int j = 0; j <remocon.size() ; j++) {
                        int tmp = Math.abs((inputs[i]-'0')-remocon.get(j));
                        if(num > tmp){
                            num = tmp;
                            inx = j;
                        }
                    }
                    output[i] = remocon.get(inx);
                    count++;
                }

                // 담은것의 차를 구해서 count에 더해준다.

                k =0;
                for (int i = inputs.length-1; i >=0 ; i--) {
                    outputsum += output[k]*Math.pow(10,i);
                    k++;
                }

                int dif = Math.abs(inputsum-outputsum);
                count +=dif;

            }else {
                // 리모컨이 고장난게 없으면 배열에 담긴 숫자만큼 카운트
                count = inputs.length;
            }
        }

        int dif = Math.abs(100-inputsum);

        System.out.println(Math.min(dif,count));

    }
}
