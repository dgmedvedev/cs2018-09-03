package lesson2;

import java.util.Arrays;

public class Task2_2 {
    /*2. Создайте массив с 10-ю переменными типа float. Далее найдите
     дубликаты и выведите их количество.
            Пример: есть массив {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} -
             в данном массиве цифра 3 и 7 повторяются.
    В результате выполнения программы на экран должно вывести:
            [3] - повторений 2
            [7] - повторений 3
*/
    public static void main(String[] args) {
        float[] mas = {2, 3, 5, 7, 6, 5, 7, 3, 7, 20};
        
        float[] mas1 = {2, 3, 5, 7, 6, 5, 7, 3, 7, 20};

        // String str = Arrays.toString(mas);
        //   int []countNumber = new int[mas.length];
        int count = 0;

        for (int i = 0; i < mas.length; i++) {

            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == mas1[j]/*&&i!=j*/) {
                    count++;
                    mas1[j]=0;
                }
            }
            //           countNumber[i]=count;
            if(count>1)System.out.println(mas[i] + " - повторений " + count);
            count = 0;
        }
    }
}
