package by.HeadFirst.MyPrograms.SomeDay;

import java.util.Scanner;

public class SomeDayStart {
    public static void main(String[] args) {
        System.out.println("Какое сегодня число?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();


        SomeDay sd = new SomeDay();
        sd.workOrNot(i);

    }
}
