public class Test_copy {
    public static void start() {
        long x=0,y=0,z=0;
        double k;
     //   k = Math.pow(x,3) + Math.pow(y,3) + Math.pow(z,3);
        for(x = 1; x < 100; x++)
            for(y = 1; y < 100; y++)
                for(z = 1; z < 100; z++)
                    if(Math.pow(x,3) + Math.pow(y,3) + Math.pow(z,3) == 29)
                        System.out.println("x = " + x + "; у = " + y + "; z = " + z);

    }
}
