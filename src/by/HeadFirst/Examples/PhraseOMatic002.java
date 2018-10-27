package by.HeadFirst.Examples;

public class PhraseOMatic002 {
    public static void main(String[] args) {
        //создал три набора слов(3 массива со строками)
        String[] myListOne = {"большой", "зеленый", "красивый", "крепкий", "холодный",
                "косматый","пушистый","прикольный","слизкий","голый"};
        String[] myListTwo = {"мультик", "гиря", "книжка", "пакет", "сундук", "корова",
                            "кораблик", "Максим","кнопка","Папа","Мамик","Дед","пингвин"};
        String[] myListThree = {"читает", "играет", "бежит", "плачит","спит","ест","надулся",
                            "убегает","скучает","горит","улюлюкает"};

        //определил, сколько слов в каждом списке(массиве со строками)
        int listOne=myListOne.length;
        int listTwo=myListTwo.length;
        int listThree=myListThree.length;

        //сгенерировал 3 случайных чмсла
        int rand1=(int)(Math.random()*listOne);
        int rand2=(int)(Math.random()*listTwo);
        int rand3=(int)(Math.random()*listThree);

        //составил фразу
        String phrase=myListOne[rand1]+" "+myListTwo[rand2]+" "+myListThree[rand3];

        //вывод фразы в консоль
        System.out.println("Это моя фраза: "+phrase);

    }
}
