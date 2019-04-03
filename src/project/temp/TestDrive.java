package project.temp;

import project.JoinLists;
import project.menu.Menu;

public class TestDrive {
    public static void start() {
        //   String json = UrlString.getStringJsonFromUrl("https://clck.ru/FTry6","newJson1");
        //    List<Category> categoryList = JsonReader.getCategories(json);

        JSON_1.start();
        JSON_2.start();

        JoinLists.choiceCategory(JSON_1.getCategoryList_1(),JSON_2.getCategoryList_2());

        Menu.isMenu();


    }
}
