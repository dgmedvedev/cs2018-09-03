package by.HeadFirst.MyPrograms.SomeDay;

import java.util.ArrayList;

public class SomeDay {
    Grafic g = new Grafic();
    ArrayList<Integer> grafic = new ArrayList<>();

    WorkDay wd = new WorkDay();
    RestDay rd = new RestDay();

    public void workOrNot(int date) {

        int exemple = date;
        grafic = g.getGraficWork();
        boolean isWork = grafic.contains(exemple);
        if (isWork) {
            System.out.println("Поздравляем у Вас сегодня рабочий день!!!");
            wd.yesOrNo();

        } else {
            System.out.println("Поздравляем у Вас сегодня выходной день!!!");
            System.out.println(rd.goodDay());
        }
    }
}
