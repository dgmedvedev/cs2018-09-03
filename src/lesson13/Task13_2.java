package lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13_2 {
    public static void start() {
        System.out.println(format("3d.studio.3DS"));
    }

    public static String format(String string) {
        String result = "";
        Pattern p = Pattern.compile("(\\.)[A-Za-z0-9]+");
        Matcher m = p.matcher(string);
        for (int i = 0; i < string.length(); i++)
            if (m.find()) {
                result = m.group();
            }
        result = result.replace(".", "");
        return result;
    }
}