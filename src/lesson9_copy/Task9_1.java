package lesson9_copy;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9_1 {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Вводите строки через Enter\n"+
                "Для завершения ввода введите END");
        String string = sc.nextLine();
        while (!string.equals("END")) {
            list.add(string);
            string = sc.nextLine();
        }

        int deletePosition;
        String oneStr;
        String newStr;
        for (int j = 0;j<list.size();j++) {
            newStr = list.get(j);
            for (int i = 0; i < newStr.length(); i++)
                if (newStr.charAt(i) == 'a'||newStr.charAt(i) == 'а') { // EN и RU 'a'
                    deletePosition = i;
                    oneStr = newStr.substring(0,deletePosition);
                    oneStr += newStr.substring(deletePosition+1);
                    newStr = oneStr;
                    i = deletePosition-1;
                }
                list.set(j,newStr);
            System.out.println(newStr);
        }
        System.out.println();
        System.out.println("Можно вывести и таким способом:");
        System.out.println(list);
    }
}