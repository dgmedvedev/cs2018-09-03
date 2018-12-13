package by.it1.medvedev3.lesson06;

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner вводятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Dog thisDog = new Dog();
        Dog otherDog = new Dog();
        Scanner sc = new Scanner(System.in);
        thisDog.setName(sc.next());
        thisDog.setAge(sc.nextInt());
        thisDog.setWeight(sc.nextInt());
        thisDog.setPower(sc.nextDouble());
        otherDog.setName(sc.next());
        otherDog.setAge(sc.nextInt());
        otherDog.setWeight(sc.nextInt());
        otherDog.setPower(sc.nextDouble());
        if(thisDog.win(otherDog)==true){
            System.out.println(thisDog.getName());
        }else System.out.println(otherDog.getName());
    }
}