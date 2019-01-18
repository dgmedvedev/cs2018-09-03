package Lesson1;

public class Task1_4 {
    public static void main(String[] args) {
        int sum = (int) (Math.random() * 10_000);
        String rub;
        if ((sum % 10 == 1&&sum%100!=11)) rub = "рубль";
        else if ((sum % 10>=2&&sum%10<=4)&&(sum%100!=12&&sum%100!=13&&sum%100!=14)) rub = "рубля";
        else rub = "рублей";
        System.out.println(sum + " " + rub);

    }
}