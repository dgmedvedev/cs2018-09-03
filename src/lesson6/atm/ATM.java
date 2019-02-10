package lesson6.atm;

import java.util.Scanner;

public abstract class ATM implements AddMoneyATM, GetMoneyATM, GetCashATM, MenuATM {
    private String titleBank;   //название банка
    private String titleMaker;  //название производителя банкомата
    private int banknote20;  //текущее количество купюр номиналом 20
    private int banknote50;  //текущее количество купюр номиналом 50
    private int banknote100; //текущее количество купюр номиналом 100
    private int cash; // остаток денег в банкомате

    ATM(int banknote20, int banknote50, int banknote100, String titleBank, String titleMaker) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
        this.titleBank = titleBank;
        this.titleMaker = titleMaker;
    }

    public boolean addMoney(int sum) {
        int change = 0;
        int tempBanknote20;
        if (sum >= 20) {
            this.banknote100 += sum / 100;
            if (sum % 100 >= 50)
                this.banknote50 += 1;

            if (sum % 100 > 50 && (sum % 100 - 50) > 20 && (sum % 100 - sum % 10) % 20 != 0) {
                if ((sum % 100 - 50) % 20 == 0) {
                    this.banknote20 += (sum % 100 - 50) / 20;
                    System.out.println("Операция удалась.\n");
                    return true;
                } else {
                    tempBanknote20 = (sum % 100 - 50) / 20;
                    this.banknote20 += tempBanknote20;
                    change += sum % 100 - 50 - 20 * tempBanknote20;
                    System.out.println("Операция удалась. Ваша сдача " + change + " $.\n");
                    return false;
                }

            } else if ((sum % 100 - sum % 10) % 20 == 0 && sum % 100 != 0) {
                if (sum % 100 > 50) {
                    this.banknote50 += -1;
                    this.banknote20 += sum % 100 / 20;
                    if (sum % 10 == 0) {
                        System.out.println("Операция удалась.\n");
                        return true;
                    } else {
                        change = sum % 10;
                        System.out.println("Операция удалась. Ваша сдача " + change + " $.\n");
                        return false;
                    }
                } else {
                    this.banknote20 += sum % 100 / 20;
                    if (sum % 10 == 0) {
                        System.out.println("Операция удалась.\n");
                        return true;
                    } else {
                        change = sum % 10;
                        System.out.println("Операция удалась. Ваша сдача " + change + " $.\n");
                        return false;
                    }
                }
            } else if ((sum % 1000) > 100 && sum % 100 < 50 && (sum % 1000 - 50 - sum % 10) % 20 == 0) {
                this.banknote100 += -1;
                this.banknote50 += 1;
                this.banknote20 += (sum % 100 + 100 - 50) / 20;
                if (sum % 10 == 0) {
                    System.out.println("Операция удалась.\n");
                    return true;
                } else {
                    change = sum % 10;
                    System.out.println("Операция удалась. Ваша сдача " + change + " $.\n");
                    return false;
                }
            } else if (sum % 100 > 50 && (sum % 100 - 50) <= 20) {
                this.banknote20 += (sum % 100 - 50) / 20;
                change += sum % 100 - 50;
                if (change % 20 != 0) {
                    System.out.println("Операция удалась. Ваша сдача " + change + " $.\n");
                    return false;
                } else {
                    System.out.println("Операция удалась.\n");
                    return true;
                }
            } else if (sum % 100 < 50 && (sum % 100) >= 20) {
                tempBanknote20 = (sum % 100) / 20;
                this.banknote20 += tempBanknote20;
                change += sum % 100 - 20 * tempBanknote20;
                if (change % 20 != 0) {
                    System.out.println("Операция удалась. Ваша сдача " + change + " $.\n");
                    return false;
                } else System.out.println("Операция удалась.\n");
                return true;
            } else if (sum % 100 == 0) {//дубль
                this.banknote20 += 0;
                if (this.banknote100 == 0 && this.banknote50 == 0) {
                    System.out.println("Операция не удалась.\n" +
                            "введите значение больше 0\n");
                    return false;
                } else {
                    System.out.println("Операция удалась.\n");
                    return true;
                }
            } else {
                change += sum % 100;
                System.out.println("Операция удалась. Ваша сдача " + change + " $.\n");
                return false;
            }
        } else {
            System.out.println("Операция не удалась.\n" +
                    "минимальная допустимая сумма для пополнения равна 20$\n");
            return false;
        }
    }

    public String getMoney(int sum) {
        int bank20;  //количество купюр номиналом 20 при снятии
        int bank50;  //количество купюр номиналом 50 при снятии
        int bank100; //количество купюр номиналом 100 при снятии

        if (sum >= 20) {
            bank100 = sum / 100;
            if (sum % 100 >= 50)
                bank50 = 1;
            else bank50 = 0;

            if (sum % 100 >= 50 && (sum % 100 - 50 >= 20 || sum % 100 - 50 == 0) && (sum % 100 - 50) % 20 == 0) {
                this.banknote100 = this.banknote100 - bank100;
                this.banknote50 = this.banknote50 - bank50;
                bank20 = (sum % 100 - 50) / 20;
                this.banknote20 = this.banknote20 - bank20;
                return printM(bank20, bank50, bank100);
            } else if (sum % 100 > 50 && (sum % 100) % 20 == 0) {
                this.banknote100 = this.banknote100 - bank100;
                bank50 = 0;
                bank20 = sum % 100 / 20;
                this.banknote20 = this.banknote20 - bank20;
                return printM(bank20, bank50, bank100);
            } else if (sum % 100 < 50 && (sum % 100) % 20 == 0) {
                this.banknote100 = this.banknote100 - bank100;
                bank50 = 0;
                bank20 = sum % 100 / 20;
                this.banknote20 = this.banknote20 - bank20;
                return printM(bank20, bank50, bank100);
            } else if ((sum % 1000) > 100 && sum % 100 < 50 && (sum % 1000 - 50) % 20 == 0) {
                bank100 = bank100 - 1;
                this.banknote100 = this.banknote100 - bank100;
                bank50 = 1;
                this.banknote50 = this.banknote50 - bank50;
                bank20 = (sum % 100 + 100 - 50) / 20;
                this.banknote20 = this.banknote20 - bank20;
                return printM(bank20, bank50, bank100);
            } else if (sum % 100 == 0) {
                this.banknote100 = this.banknote100 - bank100;
                bank20 = 0;
                if (bank100 == 0 && bank50 == 0) {
                    return "Операция не удалась.\n" +
                            "минимальная допустимая сумма для снятия равна 20$";
                } else return printM(bank20, bank50, bank100);
            } else return "Операция не удалась.\n" +
                    "в банкомате нет купюры наминалом " + sum % 10 + "\n";
        } else return "Операция не удалась.\n" +
                "минимальная допустимая сумма для снятия равна 20$";
    }

    private String printM(int b20, int b50, int b100) {
        return "Выдано:\n" +
                "купюры номиналом 20 - " + b20 + " шт.;\n" +
                "купюры номиналом 50 - " + b50 + " шт.;\n" +
                "купюры номиналом 100 - " + b100 + " шт.;\n";
    }

    public void printMoney() {
        System.out.println("Остаток денежных средств:\n" +
                "купюры номиналом 20 - " + getBanknote20() + " шт.;\n" +
                "купюры номиналом 50 - " + getBanknote50() + " шт.;\n" +
                "купюры номиналом 100 - " + getBanknote100() + " шт.;\n" +
                "Всего " + getCash() + "$");
    }

    @Override
    public void getAllCashATM() {
        System.out.println("Всего выдано " + getCash() + ".\n" +
                "купюры номиналом 20 - " + this.banknote20 + " шт.;\n" +
                "купюры номиналом 50 - " + this.banknote50 + " шт.;\n" +
                "купюры номиналом 100 - " + this.banknote100 + " шт.\n");
        this.banknote20 = 0;
        this.banknote50 = 0;
        this.banknote100 = 0;
    }

    private Scanner sc = new Scanner(System.in);
    private Scanner sc1 = new Scanner(System.in);

    @Override
    public void isMenu() {

        System.out.println("____________________________\n");
        System.out.println("ВЫБЕРИТЕ ОПЕРАЦИЮ:");
        System.out.println("1. Проверить остаток");
        System.out.println("2. Внести наличные");
        System.out.println("3. Снять часть наличных");
        System.out.println("4. Снять все наличные");
        System.out.println("5. Завершить работу");
        System.out.println("____________________________");

        while (sc.hasNextInt()) {
            switch (sc.nextInt()) {
                case 1:
                    printMoney();
                    yesOrNo();
                    return;
                case 2:
                    System.out.println("введите сумму, которую хотите внести");
                    addMoney(sc.nextInt());
                    yesOrNo();
                    return;
                case 3:
                    System.out.println("введите сумму, которую хотите снять");
                    System.out.println(getMoney(sc.nextInt()));
                    yesOrNo();
                    return;
                case 4:
                    getAllCashATM();
                    yesOrNo();
                    return;
                case 5:
                    System.out.println("Работа завершена");
                    return;
                default:
                    System.out.println("введено неверное значение");
                    yesOrNo();
                    return;
            }
        }
    }

    private void yesOrNo() {
        while (true) {
            System.out.println("продолжить работу с банкоматом? ( да / нет )");
            switch (sc1.nextLine()) {
                case "да":
                    isMenu();
                    return;
                case "нет":
                    System.out.println("Работа завершена");
                    return;
                default:
                    System.out.println("введите да или нет");
                    break;
            }
        }
    }

    public String getTitleBank() {
        return titleBank;
    }

    public String getTitleMaker() {
        return titleMaker;
    }

    public int getBanknote20() {
        return banknote20;
    }

    public int getBanknote50() {
        return banknote50;
    }

    public int getBanknote100() {
        return banknote100;
    }

    public int getCash() {
        return this.cash = this.banknote20 * 20 + this.banknote50 * 50 + this.banknote100 * 100;
    }
}
