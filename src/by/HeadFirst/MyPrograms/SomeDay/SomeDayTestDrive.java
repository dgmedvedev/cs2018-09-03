package by.HeadFirst.MyPrograms.SomeDay;

public class SomeDayTestDrive {
    public static void main(String[] args) {
        Grafic g = new Grafic();//проверяем как создается список рабочих дней
        System.out.println(g.getGraficWork());

   //     SomeDay sd = new SomeDay(); //проверяем метод workOrNot передавая значение аргумента
     //   sd.workOrNot(5);

        SomeDay sd=new SomeDay();
        sd.workOrNot(5);




    }
}
