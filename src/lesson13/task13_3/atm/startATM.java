package lesson13.task13_3.atm;

public class startATM {
    public static void start() {
        BelBankATM belBank = new BelBankATM(0, 0, 0);
        System.out.println(belBank.infoToString());
        belBank.isMenu();
    }
}