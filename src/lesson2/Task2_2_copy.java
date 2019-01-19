package lesson2;

import java.util.ArrayList;

public class Task2_2_copy {

    public static void main(String[] args) {
        float[] mas = {2, 3, 5, 7, 6, 5, 7, 3, 7, 20};
        int[]intMasOne = new int[mas.length];
        int[]intMasTwo = new int[mas.length];
        ArrayList<Integer> intList=new ArrayList<>();

        for(int i=0;i<mas.length;i++) {
            intMasOne[i] = (int) mas[i];
            intMasTwo[i] = (int) mas[i];
        }

        int count = 0;

        for (int i = 0; i < mas.length; i++) {

            for (int j = 0; j < mas.length; j++) {
                if (intMasOne[i] == intMasTwo[j]) {
                    count++;
                    intMasTwo[j] = 0;
                }
            }

        // думал будут квадратные скобки
            intList.add(i,intMasOne[i]);

            if(count>1)

                System.out.println(intList.get(i) + " - повторений " + count);
            count = 0;
        }
    }
}