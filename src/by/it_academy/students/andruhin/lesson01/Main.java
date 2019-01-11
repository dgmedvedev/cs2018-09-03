package by.it_academy.students.andruhin.lesson01;

public class Main
{
    public static void main(String[] args)
    {
        /*
        for (byte i = 0; i != -1; i++)
        {
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8)
                binary=binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            System.out.printf("%8s %4d %n",binary, i);
        }
        */
        byte Decimal = -128;
        System.out.printf("   Bin   | Oct  | Dec  | Hex %n");

        do
        {
            String Binary = Integer.toBinaryString(Decimal);
            if (Binary.length() > 8)
                Binary = Binary.substring(Binary.length() - 8);
            Binary = String.format("%8s", Binary).replace(" ", "0");

            String Octal = Integer.toOctalString(Decimal);
            if (Octal.length() > 4)
                Octal = Octal.substring(Octal.length() - 4);
            Octal = String.format("%4s", Octal).replace(" ", "0");

            String Hexadecimal = Integer.toHexString(Decimal);
            if (Hexadecimal.length() > 3)
                Hexadecimal = Hexadecimal.substring(Hexadecimal.length() - 3);
            Hexadecimal = String.format("%3s", Hexadecimal).replace(" ", "0");


            System.out.printf("%8s | %4s | %4d | %3s %n", Binary, Octal, Decimal, Hexadecimal);

            if (Decimal == 127)
                break;

            Decimal++;

        }while(true);
    }
}
