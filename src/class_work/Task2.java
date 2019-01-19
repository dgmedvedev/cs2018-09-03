package class_work;

public class Task2 {
    public static void main(String[] args) {
        int sum=0;
        final String[] catNamesArray = new String[]{"Рыжик","Барсик","Мурзик",
                "Мурка","Васька","Томасина","Бобик","Кристина","Пушок",
                "Дымка","Кузя","Китти","Барбос","Масяня","Барби"};
        for(int i=0;i<catNamesArray.length;i++){
            if(catNamesArray[i].contains("ик")){

            sum++;}
        }
        System.out.println(sum);

    }
}
