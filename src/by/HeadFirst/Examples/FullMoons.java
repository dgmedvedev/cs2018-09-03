package by.HeadFirst.Examples;
import java.util.*;

import static java.lang.System.out;

public class FullMoons {
    static int DAY_IM=1000*60*60*24;
    static int TIME_OTHER=1000*60*60*2;

    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2004,0,7,15,40);
        long day1=c.getTimeInMillis();
        for(int x=0;x<4;x++){
            day1+=(DAY_IM*29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("Полнолуние было в %tc",c));
        }
    }
}