package lesson13.task13_3;

import lesson13.task13_3.atm.BelBankATM;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task13_3_TestUnit {
    private BelBankATM atm = new BelBankATM(2, 0, 2);

    @Test
    public void addMoney() {
        assertTrue(atm.addMoney(1010));
        assertFalse(atm.addMoney(0));
        assertFalse(atm.addMoney(10));
        assertFalse(atm.addMoney(30));
        assertFalse(atm.addMoney(35));
    }

    @Test
    public void getMoney() {
        assertEquals("Выдано:\n" +
                "купюры номиналом 20 - " + 1 + " шт.;\n" +
                "купюры номиналом 50 - " + 0 + " шт.;\n" +
                "купюры номиналом 100 - " + 0 + " шт.;\n" +
                "В банкомате осталось " + 220 + " руб.", atm.getMoney(20));
        assertEquals("Выдано:\n" +
                "купюры номиналом 20 - " + 0 + " шт.;\n" +
                "купюры номиналом 50 - " + 0 + " шт.;\n" +
                "купюры номиналом 100 - " + 1 + " шт.;\n" +
                "В банкомате осталось " + 120 + " руб.", atm.getMoney(100));
        assertEquals("Недостаточно банкнот для снятия.", atm.getMoney(50));
    }
}