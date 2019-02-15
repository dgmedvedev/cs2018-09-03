package lesson7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task7_2 {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введенный Вами текст запишется в файл src" +"\\"+"text.txt");
        String text = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write(text);
            writer.flush();
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        try(FileReader reader = new FileReader("file.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}