package by.it.students.zharsky.lesson04;

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

public class TaskC3 {
    public static void main(String[] args)
    {
        int size = 10;


        for(int i=2;i<=10;i++)
        {
            for(int j=2;j<=10;j++)
            {
               System.out.println(converter(i)+" умножить на "+converter(j)+" равно "+converter((i*j)));
            }
        }
    }

    private static String converter(int num)
    {
        String[] untilTen = new String []{"один","два","три","четыре","пять","шесть","семь","восемь","девять"};
        String[] untilTwenty = new String []{"одиннадцать","двенадцать","тринадцать","четырнадцать", "пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать"};
        String[] upper = new String []{"десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят", "семьдесят","восемьдесят","девяносто","сто"};
        String s = String.valueOf(num);
        char [] ch = s.toCharArray();
        if(num>=2&&num<=9)
        {
            return untilTen[num-1];
        }
        else
        {
            if(num>=11&&num<=19)
            {
                return untilTwenty[num-11];
            }
            else if(num==100)
            {
                return upper[9];
            }
            else
            {
                String concat = "";
                int x = Character.getNumericValue(ch[0]);
                int y = Character.getNumericValue(ch[1]);
                if (y==0)
                {
                    concat=upper[x-1];
                    return concat;
                }
                else
                {
                    concat=upper[x-1]+" "+untilTen[y-1];
                    return concat;
                }

            }
        }
    }
}
