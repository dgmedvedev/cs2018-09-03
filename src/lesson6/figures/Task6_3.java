package lesson6.figures;

import lesson6.figures.triangles.*;

public class Task6_3 {

    public static void start() {
        int length = 0;
        Figure[] figures = new Figure[10];
        figures[0] = new Circle(30);
        figures[1] = new Square(40);
        figures[2] = new Rectangle(50, 60);
        figures[3] = new EquilateralTriangle(70);
        figures[4] = new IsoscelesTriangle(70, 70);
        figures[5] = new RightTriangle(70, 70);
        figures[6] = new VersatileTriangle(70, 70, 70, 60);
        figures[7] = new Square(40);
        figures[8] = new Rectangle(50, 60);
        figures[9] = new RightTriangle(60, 60);

        for (Figure f : figures) {
            if (f instanceof Triangle)
                length++;
        }

        Triangle[] triangles = new Triangle[length];
        for (int i = 0, j = 0; i < figures.length; i++) {
            if (figures[i] instanceof Triangle) {
                triangles[j] = (Triangle) figures[i];
                j++;
            }
        }


        for (int i = 0, j = 0; i < figures.length; i++) {
            if (figures[i] instanceof Triangle) {
                System.out.println("Фигура №" + (i + 1) + " - " + figures[i].getTITLE_NAME() +
                        ". Площадь = " + figures[i].getArea() + " см.кв.");
                System.out.println("Высота фигуры №" + (i + 1) + " = " + triangles[j].getHeight() + " см.");
                j++;
            } else {
                System.out.println("Фигура №" + (i + 1) + " - " + figures[i].getTITLE_NAME() +
                        ". Площадь = " + figures[i].getArea() + " см.кв.");
            }
        }
    }
}