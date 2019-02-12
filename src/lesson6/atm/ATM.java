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
                    System.out.println("Операция удалась.");
                    return true;
                } else {
                    tempBanknote20 = (sum % 100 - 50) / 20;
                    this.banknote20 += tempBanknote20;
                    change += sum % 100 - 50 - 20 * tempBanknote20;
                    System.out.println("Операция удалась. Ваша сдача " + change + " руб.");
                    return false;
                }

            } else if ((sum % 100 - sum % 10) % 20 == 0 && sum % 100 != 0) {
                if (sum % 100 > 50) {
                    this.banknote50 += -1;
                    this.banknote20 += sum % 100 / 20;
                    if (sum % 10 == 0) {
                        System.out.println("Операция удалась.");
                        return true;
                    } else {
                        change = sum % 10;
                        System.out.println("Операция удалась. Ваша сдача " + change + " руб.");
                        return false;
                    }
                } else {
                    this.banknote20 += sum % 100 / 20;
                    if (sum % 10 == 0) {
                        System.out.println("Операция удалась.");
                        return true;
                    } else {
                        change = sum % 10;
                        System.out.println("Операция удалась. Ваша сдача " + change + " руб.");
                        return false;
                    }
                }
            } else if ((sum % 1000) > 100 && sum % 100 < 50 && (sum % 1000 - 50 - sum % 10) % 20 == 0) {
                this.banknote100 += -1;
                this.banknote50 += 1;
                this.banknote20 += (sum % 100 + 100 - 50) / 20;
                if (sum % 10 == 0) {
                    System.out.println("Операция удалась.");
                    return true;
                } else {
                    change = sum % 10;
                    System.out.println("Операция удалась. Ваша сдача " + change + " руб.");
                    return false;
                }
            } else if (sum % 100 > 50 && (sum % 100 - 50) <= 20) {
                this.banknote20 += (sum % 100 - 50) / 20;
                change += sum % 100 - 50;
                if (change % 20 != 0) {
                    System.out.println("Операция удалась. Ваша сдача " + change + " руб.");
                    return false;
                } else {
                    System.out.println("Операция удалась.");
                    return true;
                }
            } else if (sum % 100 < 50 && (sum % 100) >= 20) {
                tempBanknote20 = (sum % 100) / 20;
                this.banknote20 += tempBanknote20;
                change += sum % 100 - 20 * tempBanknote20;
                if (change % 20 != 0) {
                    System.out.println("Операция удалась. Ваша сдача " + change + " руб.");
                    return false;
                } else System.out.println("Операция удалась.");
                return true;
            } else if (sum % 100 == 0) {
                this.banknote20 += 0;
                if (this.banknote100 == 0 && this.banknote50 == 0) {
                    System.out.println("Операция не удалась.\n" +
                            "введите значение больше 0");
                    return false;
                } else {
                    System.out.println("Операция удалась.");
                    return true;
                }
            } else if (sum % 100 == 50) {
                System.out.println("Операция удалась.");
                return true;
            } else {
                change += sum % 100;
                System.out.println("Операция удалась. Ваша сдача " + change + " руб.");
                return false;
            }
        } else {
            System.out.println("Операция не удалась.\n" +
                    "минимальная допустимая сумма для пополнения равна 20 руб.");
            return false;
        }
    }

    public String getMoney(int sum) {
        int bank20;  //кол-во купюр ном.20 при первоначальном разбиении числа sum
        int bank50;  //     -//- ном.50
        int bank100; //     -//- ном.100

        if (sum >= 20) {
            bank100 = sum / 100;
            if (sum % 100 >= 50)
                bank50 = 1;
            else bank50 = 0;

            if (sum % 100 >= 50 && (sum % 100 - 50 >= 20 || sum % 100 - 50 == 0) && (sum % 100 - 50) % 20 == 0) {
                bank20 = (sum % 100 - 50) / 20;
                return countBanknotes(bank20,bank50,bank100);

            } else if (sum % 100 > 50 && (sum % 100) % 20 == 0) {
                bank50 = 0;
                bank20 = sum % 100 / 20;
                return countBanknotes(bank20,bank50,bank100);

            } else if (sum % 100 < 50 && (sum % 100) % 20 == 0) {
                bank50 = 0;
                bank20 = sum % 100 / 20;
                return countBanknotes(bank20,bank50,bank100);

            } else if ((sum % 1000) > 100 && sum % 100 < 50 && (sum % 1000 - 50) % 20 == 0) {
                bank100 = bank100 - 1;
                bank50 = 1;
                bank20 = (sum % 100 + 100 - 50) / 20;
                return countBanknotes(bank20,bank50,bank100);

            } else if (sum % 100 == 0) {
                bank20 = 0;
                return countBanknotes(bank20,bank50,bank100);

            } else {
                if (this.banknote100 == 0 && this.banknote50 == 0 && this.banknote20 == 0)
                    return "В банкомате нет денег";
                else return "Недостаточно банкнот для снятия.";
            }
        } else return "Операция не удалась.\n" +
                "минимальная допустимая сумма для снятия равна 20 руб.";
    }

    private void setNumberBanknotes(int b20, int b50, int b100) {
        this.banknote100 = this.banknote100 - b100;
        this.banknote50 = this.banknote50 - b50;
        this.banknote20 = this.banknote20 - b20;
    }

    private String countBanknotes(int bank20,int bank50,int bank100){
        while (this.banknote100 < bank100) {
            bank100 = bank100 - 1;
            bank50 = bank50 + 2;
        }
        while (this.banknote50 < bank50) {
            if (this.banknote50 > 0) {
                bank50 = bank50 - 2;
                bank20 = bank20 + 5;
            } else if (this.banknote50 == 0 && bank50 % 2 == 0) {
                bank50 = bank50 - 2;
                bank20 = bank20 + 5;
            } else bank50 = -1;
        }
        if (this.banknote20 < bank20)
            bank20 = -1;

        if (bank50 >= 0 && bank20 >= 0) {
            setNumberBanknotes(bank20, bank50, bank100);
            return printM(bank20, bank50, bank100);
        } else return "недостаточно банкнот для снятия";
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

    private void printMenu() {
        System.out.println("____________________________\n");
        System.out.println("ВЫБЕРИТЕ ОПЕРАЦИЮ:");
        System.out.println("1. Проверить остаток");
        System.out.println("2. Внести наличные");
        System.out.println("3. Снять часть наличных");
        System.out.println("4. Снять все наличные");
        System.out.println("5. Завершить работу");
        System.out.println("____________________________");
    }

    @Override
    public void getAllCashATM() {
        if (this.banknote100 == 0 && this.banknote50 == 0 && this.banknote20 == 0) {
            System.out.println("В банкомате нет денег");
        } else {
            System.out.println("Всего выдано " + getCash() + ".\n" +
                    "купюры номиналом 20 - " + this.banknote20 + " шт.;\n" +
                    "купюры номиналом 50 - " + this.banknote50 + " шт.;\n" +
                    "купюры номиналом 100 - " + this.banknote100 + " шт.\n");
            this.banknote20 = 0;
            this.banknote50 = 0;
            this.banknote100 = 0;
        }
    }

    @Override
    public void isMenu() {

        printMenu();
        Scanner sc = new Scanner(System.in);
        boolean notExit = true;

        while (notExit) {
            String temp = sc.next();
            switch (temp) {
                case "1":
                    printMoney();
                    printMenu();
                    break;
                case "2":
                    System.out.println("введите сумму, которую хотите внести");
                    addMoney(sc.nextInt());
                    printMenu();
                    break;
                case "3":
                    System.out.println("введите сумму, которую хотите снять");
                    System.out.println(getMoney(sc.nextInt()));
                    printMenu();
                    break;
                case "4":
                    getAllCashATM();
                    printMenu();
                    break;
                case "5":
                    System.out.println("Работа завершена");
                    notExit = false;
                    break;
                default:
                    System.out.println("Введено неверное значение");
                    printMenu();
                    break;
            }
        }
    }


    /*
        while (sc.hasNextInt()) {
            switch (temp) {
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
                    isMenu();
                    return;
            }
        }
    }
*/

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
