package by.HeadFirst.MyPrograms.SomeDay;

import java.util.ArrayList;

public class Grafic {
    ArrayList<Integer> graficWork = new ArrayList<>();

    public ArrayList<Integer> getGraficWork() {
        int date = 1;
        while (date < 32) {
            graficWork.add(date);
            date = date + 4;

        }
        return graficWork;

    }

}
