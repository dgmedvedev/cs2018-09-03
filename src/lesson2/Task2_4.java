package lesson2;

public class Task2_4 {

    public static void start() {
        int number = 123456;
        int absNumber = Math.abs(number);
        String str = ""+absNumber;
        int[]mas=new int[str.length()];
        for(int i=0;i<str.length();i++){
            mas[i]=str.charAt(i)-'0';
        }
        for (int i = 1; i < str.length(); i++)
            if (mas[i] > mas[i - 1]) {
            } else {
                System.out.println(number + " - нет, не образуют");
                return;
            }
        System.out.println(number + " - да, образуют");
    }
}