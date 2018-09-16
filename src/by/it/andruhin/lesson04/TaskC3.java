package by.it.andruhin.lesson04;




/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/


public class TaskC3
{

    private static String GetStrNumb(int Numb)
    {
        String[][] NumbStr = {
                {"","один","два","три","четыре","пять","шесть","семь","восемь","девять"},
                {"","одиннадцать","двенадцать","тринадцать","четырнадцать", "пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать"},
                {"","десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят", "семьдесят","восемьдесят","девяносто"},
        };
        if (Numb == 100)
            return "сто";

        if (Numb < 10)
            return NumbStr[0][Numb];

        if ((Numb > 10) && (Numb < 20))
            return NumbStr[1][Numb%10];

        if (Numb%10 == 0)
            return NumbStr[2][Numb/10];

        return NumbStr[2][Numb/10] + " " + NumbStr[0][Numb%10];
    }



    public static void main(String[] args)
    {
        final int  MinInt = 2;
        final int  MaxInt = 10;
        int Result;



        for (int FirstMultiplier = MinInt; FirstMultiplier <= MaxInt; FirstMultiplier++)
        {
            for (int SecondMultiplier = MinInt; SecondMultiplier <= MaxInt; SecondMultiplier++)
            {
                Result = FirstMultiplier * SecondMultiplier;


                System.out.println(GetStrNumb(FirstMultiplier) + " умножить на " + GetStrNumb(SecondMultiplier) + " равно " + GetStrNumb(Result));
            }
            System.out.print("\n");
        }
    }
}
