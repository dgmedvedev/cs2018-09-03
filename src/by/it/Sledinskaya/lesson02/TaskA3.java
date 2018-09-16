package by.it.Sledinskaya.lesson02;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        i = 3;
        j = 4;
        k = i*i + j*j;
        System.out.print(i + "*" + i + "+" + j + "*" + j + "=");
        System.out.println(k);

    }
}
