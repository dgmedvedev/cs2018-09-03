package by.it.students.andruhin.lesson03;

/*
Lesson 03. Task A2. Стихотворение

В созданном вами методе main напишите следующий код:
Запишите свое любимое стихотворение в переменных a b c d и т.д. (типа String)
Выведите одну строку «Мое любимое стихотворение:».
Напишите еще одну строку вывода, но так, чтобы в результате выполнения программы
было выведено ваше любимое стихотворение.
В стихотворении должно быть не меньше, чем 4 строки.

Требования:
1.Программа должна выводить текст.
2.Перед стихом должна быть выведена строка "Мое любимое стихотворение:".
3.Выводимый текст должен состоять не меньше, чем из пяти строк (пустые строки - это тоже строки).
4.В выводимом тексте должно быть не менее, чем 50 символов.
5.Команд System.out.println в коде должно быть максимум две.

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/
class TaskA2
{
    public static void main(String[] args)
    {
        String a1 = "Не выходи из комнаты, не совершай ошибку.\n";
        String a2 = "Зачем тебе Солнце, если ты куришь Шипку?\n";
        String a3 = "За дверью бессмысленно все, особенно - возглас счастья.\n";
        String a4 = "Только в уборную - и сразу же возвращайся.\n\n";

        String b1 = "О, не выходи из комнаты, не вызывай мотора.\n";
        String b2 = "Потому что пространство сделано из коридора\n";
        String b3 = "и кончается счетчиком. А если войдет живая\n";
        String b4 = "милка, пасть разевая, выгони не раздевая.\n\n";

        String c1 = "Не выходи из комнаты; считай, что тебя продуло.\n";
        String c2 = "Что интересней на свете стены и стула?\n";
        String c3 = "За дверью бессмысленно все, особенно - возглас счастья.\n";
        String c4 = "таким же, каким ты был, тем более - изувеченным?\n\n";

        String d1 = "О, не выходи из комнаты. Танцуй, поймав, боссанову\n";
        String d2 = "в пальто на голое тело, в туфлях на босу ногу.\n";
        String d3 = "В прихожей пахнет капустой и мазью лыжной.\n";
        String d4 = "Ты написал много букв; еще одна будет лишней.\n\n";

        String e1 = "Не выходи из комнаты. О, пускай только комната\n";
        String e2 = "догадывается, как ты выглядишь. И вообще инкогнито\n";
        String e3 = "эрго сум, как заметила форме в сердцах субстанция.\n";
        String e4 = "Не выходи из комнаты! На улице, чай, не Франция.\n\n";

        String f1 = "Не будь дураком! Будь тем, чем другие не были\n";
        String f2 = "Не выходи из комнаты! То есть дай волю мебели,\n";
        String f3 = "слейся лицом с обоями. Запрись и забаррикадируйся\n";
        String f4 = "шкафом от хроноса, космоса, эроса, расы, вируса.";

        System.out.println("Мое любимое стихотворение:\n\n" + a1 + a2 + a3 + a4 + b1 + b2 + b3 + b4 + c1 + c2 + c3 + c4 + d1 + d2 + d3 + d4 + e1 + e2 + e3 + e4 + f1 + f2 + f3 + f4);
    }
}