package by.it.zharsky.lesson06;

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
    public static void main(String[] args)
    {
        Dog3 [] dogs = new Dog3[5];
        dogs[0] = new Dog3("Шарик", 1);
        dogs[1] = new Dog3("Жучка", 2);
        System.out.println();
    }
}
class Dog3 {

    public String name;
    public int age;
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Integer> ages = new ArrayList<Integer>();

    public Dog3(String Name, int Age) {
        names.add(Name);
        ages.add(Age);
        this.name = Name;
        this.age = Age;

    }
    public String toString()
    {
        String opening = "Кличка: ";
        String Age = "Возраст: ";;
        String ret =opening+name+". "+Age+age;

        return ret;
    }
    public String printAllNames()
    {
        String Name = "";
        for(String dog : names )
        {
            Name = dog;

        }
        return Name;
    }
}