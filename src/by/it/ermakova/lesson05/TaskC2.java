package by.it.ermakova.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class TaskC2 {
    public static void main(String[] args) {
        int[] mas=new int[20];
        int a,b,t;
        int size=20;
       for (a=1; a<size; a++){
           for (b=size-1; b>=a; b--){
               if (mas[b-1] > mas[b]){
                   t=mas[b-1];
                   mas[b-1]= mas[b];
                   mas[b]=t;
               }
           }
       }


    }





    public static void sort(int[] array) {
        //Напишите тут ваш код
    }

}
