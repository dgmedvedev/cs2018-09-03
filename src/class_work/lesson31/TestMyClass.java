package class_work.lesson31;

import java.util.LinkedList;
import java.util.List;

public class TestMyClass {
    public static void main(String[] args) {

        List<MyClass> list = new LinkedList<>();
        List<MyClass> list_1 = new LinkedList<>();//только четные номера
        List<Integer> list_2 = new LinkedList<>();//только числа


        for (int i = 1; i < 11; i++)
            list.add(new MyClass(i));
        list.get(0).setName("Первый");
        list.get(1).setName("Второй");
        list.get(2).setName("Третий");
        list.get(3).setName("Четвертый");
        list.get(4).setName("Пятый");
        list.get(5).setName("Шестой");
        list.get(6).setName("Седьмой");
        list.get(7).setName("Восьмой");
        list.get(8).setName("Девятый");
        list.get(9).setName("Десятый");

        for (MyClass myClass : list)
            if (myClass.getNUMBER() % 2 == 0)
                list_1.add(myClass);

        for (MyClass myClass : list_1)
            System.out.println(myClass);

        for (MyClass myClass : list_1)
            list_2.add(myClass.getNUMBER());

        for(Integer integer : list_2)
            System.out.print(integer + " ");
        System.out.println();

        int sum = 0;
        for (Integer integer : list_2)
            sum+=integer;
        System.out.println("sum = " + sum);



    }

}
