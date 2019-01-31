package class_work.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {

        int[] mas = new int[10];
        int[] mas1 = new int[10];
        int[] mas20 = new int[20];
        for (int i = 0; i < mas.length; i++) {
            int random = new Random().nextInt(7);
            mas[i] = random;
            random = new Random().nextInt(7);
            mas1[i] = random;

        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mas20.length; i++) {
            mas20[i] = sc.nextInt();
        }
        System.out.print("массив 1 : ");
        for (int x : mas)
            System.out.print(x + " ");
        System.out.print(" / массив 2 : ");
        for (int x : mas1)
            System.out.print(x + " ");
        System.out.println();
        System.out.print("массив 3 : ");
        for (int x : mas20)
            System.out.print(x + " ");
        System.out.println();
        if (arifmMas(mas) > arifmMas(mas1) && arifmMas(mas) > arifmMas(mas20)) {
            System.out.println("среднее арифметическое 1-го массива наибольшее и равно " + arifmMas(mas));
        } else if (arifmMas(mas1) > arifmMas(mas) && arifmMas(mas1) > arifmMas(mas20))
            System.out.println("среднее арифметическое 2-го массива наибольшее и равно " + arifmMas(mas1));
        else if (arifmMas(mas20) > arifmMas(mas) && arifmMas(mas20) > arifmMas(mas1))
            System.out.println("среднее арифметическое 3-го массива наибольшее и равно " + arifmMas(mas20));
        else System.out.println("средние арифметические значения массивов равны " +
                                    arifmMas(mas)+"="+arifmMas(mas1)+"="+arifmMas(mas20));
    }

    private static int arifmMas(int mass[]) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        return sum / mass.length;
    }

    private static int arifmMasNull(int mass[]){
        //написать метод расчета среднего арифметического не учитывая нули
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]!=0)
                sum += mass[i];

        }
        return sum / mass.length;
    }
}
