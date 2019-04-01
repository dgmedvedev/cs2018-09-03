package project.temp;

import project.JoinLists;
import project.category.Category;
import project.json.JsonReader;
import project.json.UrlString;

import java.util.List;

public class TestDrive {
    public static void start() {
        //   String json = UrlString.getStringJsonFromUrl("https://clck.ru/FTry6","newJson1");
        //    List<Category> categoryList = JsonReader.getCategories(json);

        JSON_1.start();
        JSON_2.start();

        for(Category category : JSON_1.getCategoryList_1())
            System.out.println(category);

        for(Category category : JSON_2.getCategoryList_2())
            System.out.println(category);

        JoinLists.choiceCategory(JSON_1.getCategoryList_1(),JSON_2.getCategoryList_2());

        for(Category category : JoinLists.getCategoryList())
            System.out.println(category);

    }
}
