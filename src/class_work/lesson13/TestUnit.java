package class_work.lesson13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestUnit {
    @Test
    public void array() {
        assertTrue(ClassWork13.isPositive(new int[]{1, 2, 3, 4, 5}));
        assertFalse(ClassWork13.isPositive(new int[]{-1, 2, 3}));
    }

    @Test
    public void isNumber() {
        assertTrue(ClassWork13.isAllNumber("123"));
        assertFalse(ClassWork13.isAllNumber("a23"));
        assertTrue(ClassWork13.isAllNumber(""));

    }

    @Test
    public void resultMult() {
        assertEquals(1, ClassWork13.mult(1, 1));
    }

    @Test(expected = NullPointerException.class)
    public void arrayNull(){
        ClassWork13.isPositive(null);
    }

    @Test(expected = NullPointerException.class)
    public void isNumberNull(){
        ClassWork13.isAllNumber(null);
    }

}