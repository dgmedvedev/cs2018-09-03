package lesson5.atm;

import java.util.Scanner;

public class Menu_copy {
    public static void main(String[] args) {
        ATM_copy atm = new ATM_copy();
        boolean bool = true;

        while (bool) {

            while (bool) {
                System.out.println("Выберите операцию: \n" +
                        "1. Проверить остаток в банкомате\n" +
                        "2. Положить деньги\n" +
                        "3. Снять деньги\n" +
                        "4. Выйти");
                Scanner sc = new Scanner(System.in);
                {
                    if (sc.nextInt() == 1) {
                        atm.howMuchMoneyInATM();
                        bool = false;
                    } else if (sc.nextInt() == 2) {
                        System.out.println("введите сумму, которую хотите положить");
                        if (atm.giveMoney(sc.nextInt())) {
                            if (atm.getChange() == 0) System.out.println("операция проведена успешно");
                            else if (atm.getChange() != 0) {
                                System.out.println("операция проведена успешно. ваша сдача "+atm.getChange());
                            }else System.out.println("операция не проведена");
                            bool = false;
                        }else {System.out.println("операция не проведена");
                            bool = false;}

                    } else if (sc.nextInt() == 3) {
                        System.out.println("введите сумму, которую хотите снять");
                        break;
                    } else if (sc.nextInt() == 4) {
                        System.out.println("выход");
                        break;
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
            System.out.println("если желаете повторить операцию нажмите 1");
            Scanner sc = new Scanner(System.in);
            if (sc.nextInt() == 1) bool = true;
            else bool = false;
        }
    }
}