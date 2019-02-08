package class_work.lesson4;

import java.util.Arrays;

abstract class Space {
    private int SIZE;
    private final int MAX_ANIMALS;
    private final Animal[] animals;

    Space(int SIZE, int MAX_ANIMALS) {
        this.SIZE = SIZE;
        this.MAX_ANIMALS = MAX_ANIMALS;
        animals = new Animal[MAX_ANIMALS];
    }

    int countAnimal() {
        int countAnimal = 0;
        for (Animal i : animals) {
            if (i != null) countAnimal++;
        }
        return countAnimal;
    }

    @Override
    public String toString() {
        return "Space{" +
                "animals=" + Arrays.toString(animals) +
                '}';
    }

    void addAnimal(Animal animal) {
        int countAnimal = 0;
        int size = 0;

        for (Animal a : animals)
            size += a.getSize();

        for (Animal a : animals)
            if (a != null) countAnimal++;

     //   if (countAnimal < MAX_ANIMALS && size < SIZE)//+size животного
     //       a[countAnimal] = animal;
    }
}