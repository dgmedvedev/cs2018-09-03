package lesson2;

import java.util.ArrayList;

public class Task2_6 {
    public static void start() {
        Integer[]mas={1,2,3,2,1,4,3};

        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i<mas.length;i++)
            list.add(mas[i]);

        for(int i=0;i<1;i++){
            for(int j=0;j<mas.length;j++){
                if(list1.contains(list.get(j)))
                    list1.remove(list.get(j));
                else list1.add(list.get(j));
            }
        }
        System.out.println(list1+" - не имеет пары");
    }
}