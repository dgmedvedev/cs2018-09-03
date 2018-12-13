package by.it1.medvedev3.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");
        }
        System.out.println();
    }

    static double averageAge(Dog[] dogs) {
        double sumAge = 0;

        for (Dog dog : dogs) {
            sumAge = sumAge + dog.getAge();
        }
        return sumAge / dogs.length;
    }
}