package lesson5.atm;

public class Task5_2 {
    public static void start() {
        ATM atm = new ATM();

        atm.giveMoney(362);
        System.out.println("100 - " + atm.getBanknote100());
        System.out.println("50 - " + atm.getBanknote50());
        System.out.println("20 - " + atm.getBanknote20());
        System.out.println("лишние - " + atm.getLishnie());
        System.out.println();

        atm.giveMoney(420);
        System.out.println("100 - " + atm.getBanknote100());
        System.out.println("50 - " + atm.getBanknote50());
        System.out.println("20 - " + atm.getBanknote20());
        System.out.println("лишние - " + atm.getLishnie());

    }
}