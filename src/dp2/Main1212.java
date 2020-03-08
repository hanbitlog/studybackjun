package dp2;

import java.util.*;

public class Main1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        List<String> list = new ArrayList<String>() ;
        for (int i = 0; i < n.length(); i++) {
            list.add((String) n.subSequence(i, i+1));
        }
        Map<String, String> map = new HashMap<>();
        map.put("0","000");
        map.put("1","001");
        map.put("2","010");
        map.put("3","011");
        map.put("4","100");
        map.put("5","101");
        map.put("6","110");
        map.put("7","111");

        for (int i = 0; i <n.length(); i++) {
            if(i==0 && map.get(list.get(i)).startsWith("0")==true){
                if(map.get(list.get(i))=="000"){
                    System.out.print("0");
                }else if(map.get(list.get(i))=="001"){
                    System.out.print("1");
                }else if(map.get(list.get(i))=="010"){
                    System.out.print("10");
                }else if(map.get(list.get(i))=="011"){
                    System.out.print("11");
                }

//                System.out.print(map.get(list.get(i)).replace("0",""));
            }else{
                System.out.print(map.get(list.get(i)));
            }
        }


    }

}
