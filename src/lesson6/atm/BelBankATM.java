package lesson6.atm;

public class BelBankATM extends ATM implements InfoATM {
    BelBankATM(int banknote20,int banknote50,int banknote100){
        super(banknote20,banknote50,banknote100,"Белорусский Банк", "Белорусич");
    }

    public String infoToString(){
        return "Наименование банка - "+getTitleBank()+"\n"+
                "Производитель банкомата - "+getTitleMaker();
    }
}