package lesson5.atm;

public class Task5_2 {
    public static void start() {
        ATM atm = new ATM();

        atm.giveMoney(900);
        atm.giveMoney(61);
        atm.giveMoney(22);

        atm.howMuchMoneyInATM();

        System.out.println(atm.getMoney(120));

        atm.howMuchMoneyInATM();

        System.out.println(atm.getMoney(15));
    }
}