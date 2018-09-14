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

/*import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args)
    {
        DogHelper [] dogs = new DogHelper[5];
        dogs[0] = new DogHelper("Шарик", 1);
        dogs[1] = new DogHelper("Жучка", 2);
        dogs[2] = new DogHelper("Бобик", 3);
        dogs[3] = new DogHelper("Барбос", 4);
        dogs[4] = new DogHelper("Полкан", 5);
        System.out.println();
        DogHelper.printAllNames();
        System.out.print("\n");
        System.out.println(DogHelper.averageAge());


    }
}
class DogHelper {

    public String name;
    public int age;
    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<Integer> ages = new ArrayList<Integer>();

    public DogHelper(String Name, int Age) {
        names.add(Name);
        ages.add(Age);
        this.name = Name;
        this.age = Age;

    }
    public static void printAllNames()
    {
        String s ="";
        for ( String dog : names) {
            System.out.print(dog+" ");
        }
    }
    public static double averageAge ()
    {
        double aver=0;
        for(int i : ages)
        {
            double temp = (double)i;
            aver+=temp;
        }
        aver = aver/ages.size();
        return aver;
    }

}*/