package class_work.lesson2;

import java.util.Scanner;

public class Task1_1 {
    //программа, которая определит сколько слов в строке
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == ' ')
                count++;
        }
        System.out.println("В строке "+ (count+1)+ " слова");
        System.out.println(str);
    }
}
