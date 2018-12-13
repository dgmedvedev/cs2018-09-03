package by.it1.medvedev3.lesson06;

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

public class TaskB1 {
    public static void main(String[] args) {
        Dog dog1=new Dog("Шарик",1);
        Dog dog2=new Dog("Жучка",2);
        Dog dog3=new Dog("Бобик",3);
        Dog dog4=new Dog("Барбос",4);
        Dog dog5=new Dog("Полкан",5);

        Dog[]dogs = new Dog[5];
        dogs[0]=dog1;
        dogs[1]=dog2;
        dogs[2]=dog3;
        dogs[3]=dog4;
        dogs[4]=dog5;

        DogHelper.printAllNames(dogs);
        System.out.println(DogHelper.averageAge(dogs));
    }
}
