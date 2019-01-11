package by.it_academy.students.zharsky.lesson06;

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
/*
жучка 2 5 5
мяучка 5 4 5
*/
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Dog firstDog = new Dog();
        Dog otherDog = new Dog();
        firstDog.setName(scan.next());
        firstDog.setAge(scan.nextInt());
        firstDog.setWeight(scan.nextInt());
        firstDog.setPower(scan.nextDouble());
        otherDog.setName(scan.next());
        otherDog.setAge(scan.nextInt());
        otherDog.setWeight(scan.nextInt());
        otherDog.setPower(scan.nextDouble());
        boolean verif = Dog.win(firstDog, otherDog);
        if (verif ==true){
            System.out.println(firstDog.name);
        }
        else{
            System.out.println(otherDog.name);
        }
    }
   

}
