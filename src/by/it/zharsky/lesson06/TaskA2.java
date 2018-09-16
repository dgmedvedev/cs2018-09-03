package by.it.zharsky.lesson06;

/*
    toString() для класса Dog

    Доработайте class Dog из задания A1. Создайте в классе Dog метод
    public String toString(){
        //метод должен вернуть строку экземляра класса в виде форматированной строки
        //Пример:
        Кличка: Шарик. Возраст: 5
    }

    Требования:
    1. Программа не должна считывать данные с клавиатуры.
    2. Создайте внутри метода main (класса TaskA2) две разных собаки (т.е. два объекта типа Dog)
    3. Заполните поля собак используя сеттеры.
    4. Первая - Шарик, 5 лет. Вторая - Тузик, 3 года.
    5. Напечатайте этих двух собак, выводите собак как объект без геттеров.

Обратите внимание на точки и пробелы.
Ожидается вывод:
Кличка: Шарик. Возраст: 5
Кличка: Тузик. Возраст: 3


*/
public class TaskA2
{
    public static void main(String[] args)
    {
        Dog sobaka1 = new Dog();
        Dog sobaka2 = new Dog();
        sobaka1.setName("Шарик");
        sobaka2.setName("Тузик");
        sobaka1.setAge(5);
        sobaka2.setAge(3);
        String sharik = sobaka1.getName()+" "+ sobaka1.getAge();
        String tuzik = sobaka2.getName()+" "+ sobaka2.getAge();
        System.out.println(sobaka1.toString()+"\n"+sobaka2.toString());

    }
}
