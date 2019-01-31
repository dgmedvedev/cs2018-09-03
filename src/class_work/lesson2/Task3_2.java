package class_work.lesson2;

import java.util.Random;

public class Task3_2 {
    // знания учеников после летних каникул
    public static void main(String[] args) {
        int[] masA = new int[15];
        int[] masB = new int[15];

        for (int i = 0; i < masA.length; i++) {

            masA[i] = new Random().nextInt(8) + 2;
            masB[i] = new Random().nextInt(8) + 2;
            for (int j = i - 1; j >= 0; j--) {
                if (masA[i] == masA[j] && masB[i] == masB[j] || masA[i] == masB[j] && masB[i] == masA[j]) {
                    i--;
                    break;
                }
            }
        }
        for(int x:masA)
            System.out.print(x+" ");
        System.out.println();
        for(int x:masB)
            System.out.print(x+" ");
        System.out.println();

        for(int i=0;i<masA.length;i++)
            System.out.println(masA[i]+"*"+masB[i]);
    }
}