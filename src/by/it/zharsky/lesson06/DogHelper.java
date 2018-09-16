package by.it.zharsky.lesson06;

import java.util.ArrayList;

class DogHelper {

    public static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");
        }
        System.out.println();
    }

    public static double averageAge(Dog[] dogs) {
        double aver = 0;
        for (Dog dog : dogs) {
            aver += dog.getAge();
        }
        aver = aver / dogs.length;
        return aver;
    }

}
