package by.it.students.zharsky.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2
{
    public static void main(String[]args)
    {
        try
        {Scanner scanning = new Scanner(System.in);
            int primo = scanning.nextInt();
            int secondo = scanning.nextInt();
            Decimal(primo, secondo);
            Binary(primo, secondo);
            Hexadecimal(primo, secondo);
            Octal(primo, secondo);
        }
        catch (Exception e)
        {
            System.out.println("Tooooo long number. Try again later");
        }
    }

    public static void Decimal(int primo, int secondo)
    {
        String numSyst = "DEC:";
        int answer = primo + secondo;
        Outer(numSyst ,primo, secondo, answer);
    }
    public static void Binary(int dec1, int dec2)
    {
        String numSyst = "BIN:";
        long primo = RetranslatorToBin(dec1);
        long secondo = RetranslatorToBin(dec2);
        long answer = RetranslatorToBin((dec1 + dec2));
        BinOuter(numSyst ,primo, secondo, answer);
    }
    public static void Hexadecimal(int dec1, int dec2)
    {
        String numSyst = "HEX:";
        String primo = RetranslatorToHex(dec1);
        String secondo = RetranslatorToHex(dec2);
        String answer = RetranslatorToHex((dec1 + dec2));
        HexOuter(numSyst ,primo, secondo, answer);
    }
    public static void Octal (int dec1, int dec2)
    {
        String numSyst = "OCT:";
        int primo = RetranslatorToOct(dec1);
        int secondo = RetranslatorToOct(dec2);
        int answer = RetranslatorToOct((dec1 + dec2));
        Outer(numSyst ,primo, secondo, answer);
    }

    public static void Outer(String numSyst, int primo, int secondo, int answer)
    {
        System.out.println(numSyst + primo + "+" + secondo + "=" + answer);
    }
    public static void HexOuter(String numSyst, String primo, String secondo, String answer)
    {
        System.out.println(numSyst + primo + "+" + secondo + "=" + answer);
    }
    public static void BinOuter(String numSyst, long primo, long secondo, long answer)
    {
        System.out.println(numSyst + primo + "+" + secondo + "=" + answer);
    }
    public static long RetranslatorToBin(int dec)
    {
        int temp = dec;
        String s = "";
        while(temp >=2)
        {
            int reminder = temp%2;
            temp = temp/2;
            s = s.concat(Integer.toString(reminder));
        }
        if (temp<2)
        {
            s = s.concat(Integer.toString(temp));
        }
        StringBuilder build = new StringBuilder(s);
        String str = build.reverse().toString();
        long toBin = Long.valueOf(str);
        return toBin;
    }
    public static int RetranslatorToOct(int dec)
    {
        int temp = dec;
        String s = "";
        while(temp >=8)
        {
            int reminder = temp%8;
            temp = temp/8;
            s = s.concat(Integer.toString(reminder));
        }
        if(temp<8)
        {
            s = s.concat(Integer.toString(temp));
        }
        StringBuilder build = new StringBuilder(s);
        String str = build.reverse().toString();
        int toOct = Integer.valueOf(str);
        return toOct;
    }
    public static String RetranslatorToHex(int dec)
    {
        char [] hexCollection = new char[]{'a','b','c','d','e','f'};
        int temp = dec;
        String s = "";
        while(temp >=16)
        {
            int reminder = temp%16;
            temp = temp/16;
            if (reminder>9)
            {
                int count = reminder - 9;
                String rem = Character.toString(hexCollection[count-1]);
                s = s.concat(rem);
            }
            else
            {
                s = s.concat(Integer.toString(reminder));
            }
        }
        if(temp<16)
        {
            if (temp>9)
            {
                int count = temp - 9;
                String rem = Character.toString(hexCollection[count-1]);
                s = s.concat(rem);
            }
            else
            {
                s = s.concat(Integer.toString(temp));
            }
        }
        StringBuilder build = new StringBuilder(s);
        String str = build.reverse().toString();
        return str;
    }

}
