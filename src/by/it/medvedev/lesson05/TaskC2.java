package by.it.medvedev.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


public class TaskC2 {
    public static void main(String[] args) {
        int[] mas = new int[20];

        for (int i = 0; i < mas.length; i++) {
            double random = Math.random() * 100;
            mas[i] = (int) random;
        }
        sort(mas);
    }

    public static void sort(int[] array) {

      /*
        ArrayList<Integer> list = new ArrayList<>();
        int max;
        int min;
//вывод массива в консоль
        for (int x : array)
            System.out.print(x + " ");
        System.out.println();
//поиск min и max
        if (array[1] >= array[0]) {
            max = array[1];
            min = array[0];
        } else {
            max = array[0];
            min = array[1];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] >= max)
                max = array[i];
            if (array[i] <= min)
                min = array[i];
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    */

//сортировка в убывающем порядке

        for (int i = 0; i < array.length; i++) {
            for (int j=0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int mas:array)
        System.out.print(mas+" ");
    }
}