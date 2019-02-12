package lesson6.atm;

public class Task6_1 {
    public static void start() {
        BelBankATM belBank = new BelBankATM(10, 0, 0);
        System.out.println(belBank.infoToString());
        belBank.isMenu();
    }
}