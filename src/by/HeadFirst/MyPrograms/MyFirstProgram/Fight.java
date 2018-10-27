package by.HeadFirst.MyPrograms.MyFirstProgram;

class Fight {
    Animals dog;
    Animals cat;
    WildAnimals wolf;

    void theDogOrCat() {
        dog = new Animals();
        cat = new Animals();
        wolf = new WildAnimals();

        dog.type = "dog";
        cat.type = "cat";
        wolf.type = "wolf";

        String d=dog.type;
        String c=cat.type;
        String w=wolf.type;

        dog.thePower();
        cat.thePower();
        wolf.thePower();

        System.out.println();

        int power1 = dog.power;
        int power2 = cat.power;
        int power3 = wolf.power;

        if (power1 > power2 && power1 > power3) {
            System.out.print(power1 + " > ");
            if (power2 > power3) {
                System.out.println(power2 + " > " + power3);
                System.out.println("Первое место занял " +d);
                System.out.println("Второе место занял "+c);
                System.out.println("Третье место занял "+w);
            } else if (power3 > power2) {
                System.out.println(power3 + " > " + power2);
                System.out.println("Первое место занял "+d);
                System.out.println("Второе место занял "+w);
                System.out.println("Третье место занял "+c);
            } else System.out.println("Второе место заняли "+w+" и "+c);
        }
        else if (power2 > power1 && power2 > power3) {
            System.out.print(power2 + " > ");
            if (power1 > power3) {
                System.out.println(power1 + " > " + power3);
                System.out.println("Первое место занял "+c);
                System.out.println("Второе место занял "+d);
                System.out.println("Третье место занял "+w);
            } else if (power3 > power1) {
                System.out.println(power3 + " > " + power1);
                System.out.println("Первое место занял "+c);
                System.out.println("Второе место занял "+w);
                System.out.println("Третье место занял "+d);
            } else System.out.println("Второе место заняли "+w+" и "+d);
        }
        else if (power3 > power2 && power3 > power1) {
            System.out.print(power3 + " > ");
            if (power2 > power1) {
                System.out.println(power2 + " > " + power1);
                System.out.println("Первое место занял "+w);
                System.out.println("Второе место занял "+c);
                System.out.println("Третье место занял "+d);
            } else if (power1 > power2) {
                System.out.println(power1 + " > " + power2);
                System.out.println("Первое место занял wolf"+w);
                System.out.println("Второе место занял dog"+d);
                System.out.println("Третье место занял cat"+c);
            } else System.out.println("Второе место заняли "+d+" и "+c);
        } else System.out.println("Силы равны!");
    }
}