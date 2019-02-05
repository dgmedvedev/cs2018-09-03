package lesson5.atm;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ATM atm = new ATM();


        System.out.println("Выберите операцию: \n" +
                "1. Проверить остаток в банкомате\n" +
                "2. Положить деньги\n" +
                "3. Снять деньги\n" +
                "4. Выйти");
        Scanner sc = new Scanner(System.in);
        {
            if (sc.nextInt() == 1) atm.howMuchMoneyInATM();
            else if (sc.nextInt() == 2) {
                System.out.println("введите сумму, которую хотите положить");

            } else if (sc.nextInt() == 3) {
                System.out.println("введите сумму, которую хотите снять");
                atm.giveMoney(sc.nextInt());
            } else if (sc.nextInt() == 4) {
                System.out.println("выход");
            } else {
                System.out.println("вы ввели неверное значение.");
                System.out.println();
                System.out.println("Выберите операцию: \n" +
                        "1. Проверить остаток в банкомате\n" +
                        "2. Положить деньги\n" +
                        "3. Снять деньги\n");
            }
        }
    }
}