package by.HeadFirst.Examples;

public class BottlesOfBeer001 {
    public static void main(String[] args) {
        int i=99;
        String s=" бутылок пива";
        String s1="Возьми одну, пусти по кругу";

        while(i>0) {

            System.out.println(i + s + " на стене");
            System.out.println(i + s + "!");
            System.out.println(s1);
            i--;
            if(i==1){s=" бутылка пива";}
            if (i > 0) {
                System.out.println(i + s + " на стене!");
            } else {
                System.out.println("Нет" + s + " на стене");
                System.out.println("Нет" + s + "!");
            }

        }
    }
}
/*
<количество> бутылок пива на стене
<количество> бутылок пива!
Возьми одну, пусти по кругу
<количество минус 1> бутылок пива на стене!
*/