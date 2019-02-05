package lesson5.atm;

public class ATM_copy {
    private int banknote20;  //количество купюр наминалом 20
    private int banknote50;  //количество купюр наминалом 50
    private int banknote100; //количество купюр наминалом 100
    private int change;

    private int sum; // остаток денег в банкомате


    // метод добавления денег
    boolean giveMoney(int number) {

        this.change = 0;
        int tempBanknote20;
        if (number >= 20) {
            this.banknote100 += number / 100;
            if (number % 100 >= 50)
                this.banknote50 += 1;
            else this.banknote50 += 0;

            if (number % 100 > 50 && (number % 100 - 50) > 20) {
                if ((number % 100 - 50) % 20 == 0) {
                    this.banknote20 += (number % 100 - 50) / 20;
                    System.out.println("Операция удалась.");
                    return true;
                } else {
                    tempBanknote20 = (number % 100 - 50) / 20;
                    this.banknote20 += tempBanknote20;
                    this.change += number % 100 - 50 - 20 * tempBanknote20;
                    System.out.println("Операция удалась. Ваша сдача " + this.change + " $.");
                    return false;
                }

            } else if (number % 100 > 50 && (number % 100 - 50) <= 20) {
                this.banknote20 += (number % 100 - 50) / 20;
                this.change += number % 100 - 50;
                if (this.change % 20 != 0) {
                    System.out.println("Операция удалась. Ваша сдача " + this.change + " $.");
                    return false;
                } else {
                    System.out.println("Операция удалась.");
                    return true;
                }
            } else if (number % 100 < 50 && (number % 100) >= 20) {
                tempBanknote20 = (number % 100) / 20;
                this.banknote20 += tempBanknote20;
                this.change += number % 100 - 20 * tempBanknote20;
                if (this.change % 20 != 0) {
                    System.out.println("Операция удалась. Ваша сдача " + this.change + " $.");
                    return false;
                } else System.out.println("Операция удалась.");
                return true;
            } else {
                this.change += number % 100;
                System.out.println("Операция удалась. Ваша сдача " + this.change + " $.");
                return false;
            }
        } else {
            System.out.println("Операция не удалась.\n" +
                    "минимальная допустимая сумма для пополнения равна 20$\n");
            return false;
        }
    }

    // метод снятия денег
    String getMoney(int number) {
        int bank20;  //количество купюр наминалом 20 при снятии
        int bank50;  //количество купюр наминалом 50 при снятии
        int bank100; //количество купюр наминалом 100 при снятии

        if (number >= 20) {
            bank100 = number / 100;
            if (number % 100 >= 50)
                bank50 = 1;
            else bank50 = 0;

            if (number % 100 >= 50 && (number % 100 - 50 >= 20 || number % 100 - 50 == 0) && (number % 100 - 50) % 20 == 0) {
                this.banknote100 = this.banknote100 - bank100;
                this.banknote50 = this.banknote50 - bank50;
                bank20 = (number % 100 - 50) / 20;
                this.banknote20 = this.banknote20 - bank20;
                return "Выдано:\n" +
                        "купюры номиналом 20 - " + bank20 + " шт.;\n" +
                        "купюры номиналом 50 - " + bank50 + " шт.;\n" +
                        "купюры номиналом 100 - " + bank100 + " шт.;\n";
            } else if (number % 100 > 50 && (number % 100) % 20 == 0) {
                this.banknote100 = this.banknote100 - bank100;
                bank50 = 0;
                bank20 = number % 100 / 20;
                this.banknote20 = this.banknote20 - bank20;
                return "Выдано:\n" +
                        "купюры номиналом 20 - " + bank20 + " шт.;\n" +
                        "купюры номиналом 50 - " + bank50 + " шт.;\n" +
                        "купюры номиналом 100 - " + bank100 + " шт.;\n";
            } else if (number % 100 < 50 && (number % 100) % 20 == 0) {
                this.banknote100 = this.banknote100 - bank100;
                bank50 = 0;
                bank20 = number % 100 / 20;
                this.banknote20 = this.banknote20 - bank20;
                return "Выдано:\n" +
                        "купюры номиналом 20 - " + bank20 + " шт.;\n" +
                        "купюры номиналом 50 - " + bank50 + " шт.;\n" +
                        "купюры номиналом 100 - " + bank100 + " шт.;\n";
            } else if (number % 100 == 0) {
                this.banknote100 = this.banknote100 - bank100;
                bank20 = 0;
                if (bank100 == 0 && bank50 == 0) {
                    return "Операция не удалась.\n" +
                            "минимальная допустимая сумма для снятия равна 20$\n";
                } else return "Выдано:\n" +
                        "купюры номиналом 100 - " + bank100 + " шт.;\n";
            } else return "Операция не удалась.\n" +
                    "в банкомате нет купюры наминалом " + number % 10 + "\n";
        }else return "Операция не удалась.\n" +
                "минимальная допустимая сумма для снятия равна 20$\n";
    }
    //    if (getSum() - number > 0) {sout "считаю"}
    //    } else return "в банкомате недостаточно денег.\n" +
    //            "всего доступно " + getSum() + " $.";}

    void howMuchMoneyInATM() {

        System.out.println("В банкомате находится " + getSum() + " $ :\n" +
                "купюры номиналом 20 - " + this.banknote20 + " шт.;\n" +
                "купюры номиналом 50 - " + this.banknote50 + " шт.;\n" +
                "купюры номиналом 100 - " + this.banknote100 + " шт.;\n");
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
        return (this.banknote20 * 20) + (this.banknote50 * 50) + (this.banknote100 * 100);
    }

    public int getChange() {
        return change;
    }
}
