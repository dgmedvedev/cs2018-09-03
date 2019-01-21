package lesson2;

import java.util.Arrays;

public class Task2_4_copy {
    // уверен, что есть решение попроще)
    private static int number = -12345;
    private static String str = "" + number;
    private static int[] mas1 = new int[str.length()];
    private static int[] mas2 = new int[str.length() - 1];
    private static int[] mas3 = new int[mas1.length];
    private static int[] mas4 = new int[mas2.length];

    public static void start() {

        strToMas(str);
        if (number >= 0) {
            for (int i = 0, j = 1; j < mas1.length; j++) {
                if (mas1[i] == mas1[j] - j) {
                    mas3[j - 1] = mas1[j - 1];
                }
            }

            mas3[mas1.length - 1] = mas1[mas1.length - 1];

            if (Arrays.equals(mas1, mas3)) {
                for (int print : mas3)
                    System.out.print(print);
                System.out.println(" - образуют");
            } else {
                for (int print : mas1)
                    System.out.print(print);
                System.out.println(" - не образуют");
            }
        }

        if (number < 0) {
            for (int i = 0, j = 1; j < mas2.length; j++) {

                if (mas2[i] == mas2[j] - j) {
                    mas4[j - 1] = mas2[j - 1];
                }
            }

            mas4[mas2.length - 1] = mas2[mas2.length - 1];

            if (Arrays.equals(mas2, mas4)) {
                System.out.print("-");
                for (int print : mas4)
                    System.out.print(print);
                System.out.println(" - образуют");
            } else {
                System.out.print("-");
                for (int print : mas2)
                    System.out.print(print);
                System.out.println(" - не образуют");
            }
        }
    }

    private static void strToMas(String myString) {
        if (number >= 0) {
            for (int i = 0; i < myString.length(); i++) {
                mas1[i] = Integer.parseInt(String.valueOf(myString.charAt(i)));
            }
        } else {
            for (int i = 0; i < myString.length() - 1; i++) {
                mas2[i] = Integer.parseInt(String.valueOf(myString.charAt(i + 1)));
            }
        }
    }
}