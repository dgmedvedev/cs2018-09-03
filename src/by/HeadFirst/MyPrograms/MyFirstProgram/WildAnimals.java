package by.HeadFirst.MyPrograms.MyFirstProgram;

public class WildAnimals {
    int power;
    String type;

    void thePower() {

        int speed=(int)(Math.random()*100);
        int size=(int)(Math.random()*100);
        int weight=(int)(Math.random()*100);
        power = (int)((size * weight + speed)*1.4);
        System.out.print("Сила "+type+" "+power+" . ");

    }
}