import java.util.Scanner;

public class Main1924 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();

        int[] dayInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dayOfTheWeeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int totalDays = day;
        for(int i =0; i<month-1; i++){
            totalDays = totalDays + dayInMonth[i];
        }
        System.out.println(dayOfTheWeeks[totalDays%7]);
    }
}
