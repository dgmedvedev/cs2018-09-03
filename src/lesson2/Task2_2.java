package lesson2;

public class Task2_2 {

    public static void start() {
        float[] mas = {2, 3, 5, 7, 6, 5, 7, 3, 7, 20};
        int[] intMasOne = new int[mas.length];
        int[] intMasTwo = new int[mas.length];

        for (int i = 0; i < mas.length; i++) {
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
            if (count > 1) System.out.println("[" + intMasOne[i] + "]" + " - повторений " + count);
            count = 0;
        }
    }
}