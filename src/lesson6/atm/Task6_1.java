package lesson6.atm;

public class Task6_1 {
    public static void start() {
        BelBankATM belBank = new BelBankATM(20, 30, 40);
        RusBankATM rusBank = new RusBankATM(30, 40, 50);


        System.out.println(belBank.InfoToString());
        belBank.printMoney();
        belBank.addMoney(325);
        belBank.printMoney();
        System.out.println(belBank.getMoney(2320));
        belBank.printMoney();
        belBank.getAllCashATM();
        belBank.printMoney();
        belBank.addMoney(1325);
        belBank.printMoney();
    }
}
