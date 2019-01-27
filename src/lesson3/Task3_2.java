package lesson3;

import java.util.Scanner;

public class Task3_2 {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Для "+N+" новостей необходимо "+findNumber(N)+" страниц");

    }
    private static int findNumber(int news){
        int number = news/10;
        int remainder = news - number*10;
        if(remainder==0)return number;
        else return number+1;
    }
}