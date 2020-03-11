package dp2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main10825 {
    static class Student {
        String name ;
        int kor;
        int eng;
        int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        Student student[]  = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            student[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.kor < o2.kor) return 1;
                else if (o1.kor>o2.kor) return -1;
                else {
                    if(o1.eng < o2.eng) return -1;
                    else if(o1.eng>o2.eng) return 1;
                    else {
                        int len = Math.min(o1.name.length(), o2.name.length());
                        for(int i =0; i<len; i++){
                            if(o1.name.charAt(i) != o2.name.charAt(i)){
                                return o1.name.charAt(i) - o2.name.charAt(i);
                            }
                        }
                    }
                }return 0;
            }
        });

        for (int i = 0; i <n ; i++) {
            System.out.println(student[i].name);
        }


    }

}
