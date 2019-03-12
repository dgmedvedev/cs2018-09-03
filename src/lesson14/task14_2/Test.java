package lesson14.task14_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println(CheckSum.getCheckSum("d:\\medvedev\\cs2018-09-03\\text12_hw.txt"));
     //   Search.showTree("d:\\",0);

        System.out.println(System.currentTimeMillis() - startTime);

        long value = 60000;
        String duration = new SimpleDateFormat("HH:mm:ss").format(new Date(TimeUnit.SECONDS.toSeconds(value)));
        System.out.println(duration);
    }
}