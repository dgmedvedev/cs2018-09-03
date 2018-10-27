package by.HeadFirst.MyPrograms.MyFirstProgram;

class Animals {
    int power;
    String type;

    void thePower() {

        int speed,size,weight;
        speed=(int)(Math.random()*100);
        size=(int)(Math.random()*100);
        weight=(int)(Math.random()*100);
        power = size * weight + speed;
        System.out.print("Сила "+type+" "+power+" . ");

    }
}
