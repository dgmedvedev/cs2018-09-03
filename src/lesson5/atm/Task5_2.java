package lesson5.atm;

public class Task5_2 {
    public static void start() {
        ATM atm = new ATM();


        atm.giveMoney(60);
        atm.giveMoney(60);
        atm.giveMoney(22);

        atm.howMuchMoneyInATM();

        System.out.println(atm.getMoney(120));
        System.out.println(atm.getMoney(15));

    }
}