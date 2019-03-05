package class_work.lesson13;

public class ClassWork13 {

    static boolean isPositive(int[] arr) {
        for (int i : arr) {
            if (i <= 0)
                return false;
        }
        return true;
    }

    static boolean isAllNumber(String string) {
        char[] charArray = string.toCharArray();
        for (char i : charArray) {
            String str = "0123456789";
            if (!str.contains(String.valueOf(i))) return false;
        }
        return true;
    }

    static int mult(int i, int j) {
        return i * j;
    }
}