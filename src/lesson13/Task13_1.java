package lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13_1 {

    public static void start() {
        System.out.println(zip("hellowoooorld"));
    }

    private static String zip(String string) {
        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile("(.)\\1*");

        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            result.append(matcher.group(1));
            int length = matcher.group().length();
            if (length > 1)
                result.append(length);
        }
        return result.toString();
    }
}