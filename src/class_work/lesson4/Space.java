package class_work.lesson4;

import java.util.Arrays;

abstract class Space {
    private double SIZE;
    private final int MAX_ANIMALS;
    private final Animal[] animals;
    private int countAnimal;

    Space(int SIZE, int MAX_ANIMALS) {
        this.SIZE = SIZE;
        this.MAX_ANIMALS = MAX_ANIMALS;
        animals = new Animal[MAX_ANIMALS];
    }

    int countAnimal() {
        int count = 0;
        for (Animal i : animals) {
            if (i != null) count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "Space{" +
                "animals=" + Arrays.toString(animals) +
                '}';
    }

    public void printAll(){
        for(Animal animal:animals)
            if(animal != null)
                System.out.println(animal.toString());
    }

    public boolean addAnimal(Animal animal) {
        if (countAnimal < MAX_ANIMALS && (this.SIZE - animal.getSize())>0&&canLive(animal)) {
            this.SIZE = this.SIZE - animal.getSize();
            animals[countAnimal] = animal;
            countAnimal ++;
            return true;
        }return false;
    }

    abstract boolean canLive(Animal animal);
}