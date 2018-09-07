package by.it.andruhin.lesson02;

import java.util.Scanner;

import java.math.BigDecimal;

import java.math.RoundingMode;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3
{
    /*
    public static double getWeight(int Weight)
    {
        return (double)Math.round( (double)Weight / 9.81 * 3.86 * 100) / 100; //Да, это нечитаемая дичь, но работает хД
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Weight1 = sc.nextInt();
        System.out.println(getWeight(Weight1));
    }
    */


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();

        System.out.println(getWeight(weight));
    }

    public static double getWeight(int weightEarth)
    {
        double weightMarsDouble = weightEarth / 9.81 * 3.86;

        BigDecimal weightMarsObj = new BigDecimal(weightMarsDouble);
        weightMarsObj = weightMarsObj.setScale(2, RoundingMode.HALF_UP);

        String weightMarsStr = String.valueOf(weightMarsObj);
        weightMarsDouble = Double.valueOf(weightMarsStr);

        return weightMarsDouble;
    }
}
