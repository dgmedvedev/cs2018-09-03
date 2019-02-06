package lesson5.atm;

public class Task5_2 {
    public static void start() {
        ATM atm = new ATM();

        atm.giveMoney(413);
        atm.giveMoney(111);
        atm.giveMoney(180);
        atm.giveMoney(195);

        atm.howMuchMoneyInATM();
        System.out.println(atm.getMoney(180));
        atm.howMuchMoneyInATM();
        System.out.println(atm.getMoney(210));
        atm.howMuchMoneyInATM();
        System.out.println(atm.getMoney(111));
        atm.howMuchMoneyInATM();
    }
}