package by.it.medvedev.homework;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        int result;
        for (i = 0; i < 10; i++) {
            result = 1;
            int e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 в степени " + i + " равно " + result);
        }
        System.out.println("a = "+a+";" + "b = "+b);
        if (a>=b) {
            if (a==b) System.out.println("a = b");
            else System.out.println("a > b");

        } else System.out.println("a < b");
    }
}
