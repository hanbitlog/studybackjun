package dp2;

import java.util.*;

public class Main9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String result = "YES";
        for (int i = 0; i <count ; i++) {
            List<String> list = Arrays.asList(sc.next().split(""));
            Stack<Integer> st = new Stack<Integer>();
            for (int j = 0; j <list.size() ; j++) {
                    if(list.get(j).equals("(")  ){
                        st.push(1);
                    }else if(list.get(j).equals(")") ){
                        if(st.isEmpty()){
                            result = "NO";
                            break;
                        }else {
                            st.pop();
                            result = "YES";
                        }
                    }
            }
            if(!st.isEmpty()){
                result = "NO";
            }
            System.out.println(result);
        }



    }

}
