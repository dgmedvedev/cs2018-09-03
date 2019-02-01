package lesson4;

import java.util.Scanner;

public class PatientTestDrive {
    public static void main(String[] args) {
        System.out.println("Введите данные о пациентах:");
        Patient pat1 = new Patient();
        Patient pat2 = new Patient();
        Patient pat3 = new Patient();

    //    Patient pat1 = new Patient("Иванов Иван Иванович",20,"здоров");
    //    Patient pat2 = new Patient("Петров Иван Петрович",20,"здоров");
    //    Patient pat3 = new Patient("Сидоров Сидр Сидорович",15,"болен");

        pat1.print();
        pat2.print();
        pat3.print();
        System.out.println();

        String str1 = pat1.getAllInfoPatient();
        String str2 = pat2.getAllInfoPatient();
        String str3 = pat3.getAllInfoPatient();

        System.out.println("Для поиска пациента введите любое значение из перечисленных (фамилию, имя, отчество, возраст)");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        try {
            int number = Integer.parseInt(string);
            if (number >= 0&&(number==pat1.getAge()||number==pat2.getAge()||number==pat3.getAge())) {
                System.out.println("Найдены следующие совпадения:");
                if(str1.contains(String.valueOf(number))) System.out.println(str1);
                if(str2.contains(String.valueOf(number))) System.out.println(str2);
                if(str3.contains(String.valueOf(number))) System.out.println(str3);

            } else {
                System.out.println("совпадения по возрасту не найдены");
            }
        } catch (NumberFormatException e) {
            if(str1.contains(string)||str2.contains(string)||str3.contains(string)){
                System.out.println("Найдены следующие совпадения:");
                if(str1.contains(string)) System.out.println(str1);
                if(str2.contains(string)) System.out.println(str2);
                if(str3.contains(string)) System.out.println(str3);
            }
            else System.out.println("совпадения не найдены");
        }
    }
}