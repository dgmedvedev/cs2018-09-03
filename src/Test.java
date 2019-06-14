public class Test {
    public static void start() {
        long start = System.currentTimeMillis();
        long end;
        long x, y, z;
        long x1, y1, z1;
        for (x = -1000L; x < 100L; x++) {
            for (y = -1000L; y < 100L; y++) {
                for (z = -1000L; z < 100L; z++) {
                    if ((Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3)) == 1
                            && Math.abs(x) != Math.abs(y) && Math.abs(x) != Math.abs(z) && Math.abs(y) != Math.abs(z)) {
                        x1 = x;
                        y1 = y;
                        z1 = z;//
                        end = System.currentTimeMillis() - start;
                        System.out.println("x = " + x + "; у = " + y + "; z = " + z);
                        System.out.println("end = " + end);
                    }
                }
            }
        }
    }
}