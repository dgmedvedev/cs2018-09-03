package by.it1.decisions_9h37m53s.lesson06_1h42m52s;

public class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (Dog tempDog:dogs){
            System.out.print(tempDog.getName()+" ");
        }System.out.println();
    }

    static double averageAge(Dog[] dogs){
        double sumAge=0;
        for(Dog age:dogs){
            sumAge+=age.getAge();
        }
        return sumAge/(double)dogs.length;
    }
}