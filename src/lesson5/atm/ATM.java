package lesson5.atm;

public class ATM {
    private int banknote20;  //количество купюр наминалом 20
    private int banknote50;  //количество купюр наминалом 50
    private int banknote100; //количество купюр наминалом 100
    private int sum; // остаток денег в банкомате
    private int lishnie;



    public boolean giveMoney(int number) {

        this.lishnie = 0;

        this.banknote100 += number / 100;
        if (number % 100 >= 50)
            this.banknote50 += 1;
        else this.banknote50 += 0;

        if (number % 100 > 50 && (number % 100 - 50) > 20) {
            if ((number % 100 - 50) % 20 == 0) {
                this.banknote20 += (number % 100 - 50) / 20;
                return true;
            } else {
                this.banknote20 += (number % 100 - 50) / 20;
                this.lishnie += number % 100 - 50 - 20 * banknote20;
                return false;
            }

        } else if (number % 100 > 50 && (number % 100 - 50) < 20) {
            this.banknote20 += (number % 100 - 50) / 20;
            this.lishnie += number % 100 - 50;
            return false;
        } else this.banknote20 += (number % 100) / 20;
        this.lishnie += number % 100 - 20 * banknote20;
        return false;
    }

    public double getBanknote20() {
        return banknote20;
    }

    public double getBanknote50() {
        return banknote50;
    }

    public int getBanknote100() {
        return banknote100;
    }

    public int getSum() {
        return sum;
    }

    public int getLishnie() {
        return lishnie;
    }
}
