package lesson6.atm;

public class RusBankATM extends ATM implements InfoATM {
    RusBankATM(int banknote20,int banknote50,int banknote100){
        super(banknote20,banknote50,banknote100,"Русский Банк", "Русич");
    }

    public String InfoToString(){
        return "Наименование банка - "+getTitleBank()+"\n"+
                "Производитель банкомата - "+getTitleMaker();
    }
}