package project;

import project.menu.Menu;
import project.tasks.Task;
import project.temp.JSON_1;
import project.temp.JSON_2;

public class StartProject {
    public static void start() {
        /* не работает.
           String json = UrlString.getStringJsonFromUrl("https://clck.ru/FTry6","newJson1");
           List<Category> categoryList = JsonReader.getCategories(json);*/

        JSON_1.start();
        JSON_2.start();
        if (JSON_1.getIdTaskJSON_1() >= JSON_2.getIdTaskJSON_2())
            Task.setIdTask(JSON_1.getIdTaskJSON_1());
        else Task.setIdTask(JSON_2.getIdTaskJSON_2());

        JoinLists.choiceCategory(JSON_1.getCategoryList_1(), JSON_2.getCategoryList_2());

        Menu.isMenu();


    }
}
