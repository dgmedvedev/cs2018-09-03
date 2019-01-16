package by.it1.decisions_9h37m53s.lesson06_1h42m52s;

/*

B. (продолжение задач уровня А).

Создайте новый класс DogHelper и в нем два статических метода
void printAllNames(Dog[] dogs){.....}; //должен печатать в консоль через пробел имена всех собак
double averageAge(Dog[] dogs){.....}; //должен вычислять средний возраст переданных ему собак

В классе TaskB1 и его методе main
    Создайте массив из 5 разных собак. Дайте всем клички и укажите возраст.
    Шарик 1 год, Жучка 2 года, Бобик 3 года, Барбос 4 года, Полкан 5 лет

    Напечатайте их имена с помощью метода printAllNames, ожидается
    Шарик Жучка Бобик Барбос Полкан

    Напечатайте с новой строки их средний возраст,
    рассчитанный через метод averageAge, ожидается:
    3.0

Итого, правильный вывод такой:
Шарик Жучка Бобик Барбос Полкан
3.0

*/

import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        Dog[] dogMas = new Dog[5];
        dogMas[0] = new Dog("Шарик", 1);
        dogMas[1] = new Dog("Жучка", 2);
        dogMas[2] = new Dog("Бобик", 3);
        dogMas[3] = new Dog("Барбос", 4);
        dogMas[4] = new Dog("Полкан", 5);



        DogHelper.printAllNames(dogMas);

        System.out.println(DogHelper.averageAge(dogMas));
    }
}
