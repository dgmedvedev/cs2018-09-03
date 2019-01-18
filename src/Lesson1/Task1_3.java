package Lesson1;

public class Task1_3 {
    public static void main(String[] args) {

        int a = (int) (Math.random() * 1000);
        int b = (int) (Math.random() * 1000);
        int r = (int) (Math.random() * 1000);

        int c = (int) Math.sqrt(Math.pow((a / 2.0), 2) + Math.pow((b / 2.0), 2));
        // с - расстояние от центра прямоугольника до его вершины.
        // т.е. то min расстояние, которое должен закрыть радиус круга.

        System.out.println
                (r >= c ? "Отверстие закроется т.к. " + r + " >= " + c : "Отверстие НЕ закроется т.к. " + r + " < " + c);
    }
}
