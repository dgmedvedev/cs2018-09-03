package project.temp;

import org.codehaus.jackson.map.ObjectMapper;
import project.category.Category;
import project.json.JsonSave;
import project.tasks.EverydayTask;
import project.tasks.RequiredTask;
import project.tasks.Task;
import project.tasks.TemporaryTask;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JSON_2 {
    private static List<Category> categoryList_2 = new LinkedList<>();
    private static int idTaskJSON_2;

    public static void start() {
        Category.setIdCategories(0);
        Task.setIdTask(0);

        Category category = new Category("Быт", "RED");
        RequiredTask one = new RequiredTask("Записать сына на футбол", 9, "Семья");
        one.setDescription("ЛОР");
        RequiredTask two = new RequiredTask("Оплатить кредит", 8, "Финансы");
        two.setDescription("до 1-го числа");
        RequiredTask three = new RequiredTask("Заменить масло ДВС", 9, "Авто");
        three.setDescription("до 80000 км");
        category.getRequiredTaskList().add(one);
        category.getRequiredTaskList().add(two);
        category.getRequiredTaskList().add(three);

        TemporaryTask oneT = new TemporaryTask
                ("Купить ноутбук", 5, "Финансы", "01.01.2021");
        oneT.setDescription("Apple");
        TemporaryTask twoT = new TemporaryTask
                ("Заехать к родителям перед отпуском", 6, "Семья", "01.06.2019");
        twoT.setDescription("Цветы и рыбы");
        category.getTemporaryTaskList().add(oneT);
        category.getTemporaryTaskList().add(twoT);

        EverydayTask oneE = new EverydayTask("Забрать ребенка из сада", 9);
        oneE.setSuccessfulExecution(1111);
        EverydayTask twoE = new EverydayTask("Покормить рыб", 7);
        twoE.setSuccessfulExecution(888);
        twoE.setUnsuccessfulExecution(50);
        twoE.setDescription("кроме субботы");
        category.getEverydayTaskList().add(oneE);
        category.getEverydayTaskList().add(twoE);

        Category category2 = new Category("Работа", "YELLOW");
        RequiredTask oneC2 = new RequiredTask("4-тэк топливо", 9, "Отчеты");
        oneC2.setDescription("годовой");
        RequiredTask twoC2 = new RequiredTask("Письмо в Минтранс", 8, "Списание ОС");
        twoC2.setDescription("О согласовании");
        RequiredTask threeC2 = new RequiredTask("Гарантийный осмотр", 8, "Авто");
        threeC2.setDescription("Toyota до 24000 км");
        category2.getRequiredTaskList().add(oneC2);
        category2.getRequiredTaskList().add(twoC2);
        category2.getRequiredTaskList().add(threeC2);

        TemporaryTask oneTC2 = new TemporaryTask
                ("Замена а/шин", 5, "Авто", "01.05.2019");
        oneTC2.setDescription("отчет после замены");
        TemporaryTask twoTC2 = new TemporaryTask
                ("Счет за резку вагонов", 7, "Списание ОС", "01.05.2019");
        twoTC2.setDescription("Гомельвторчермет");
        category2.getTemporaryTaskList().add(oneTC2);
        category2.getTemporaryTaskList().add(twoTC2);

        EverydayTask oneEC2 = new EverydayTask("Инфо по вагонам", 8);
        oneEC2.setSuccessfulExecution(10000);
        category2.getEverydayTaskList().add(oneEC2);

        Category category3 = new Category("Отпуск", "GREEN");
        RequiredTask oneC3 = new RequiredTask("Забронировать путевку", 10, "Relax");
        oneC3.setDescription("до 01.06.2019");
        category3.getRequiredTaskList().add(oneC3);

        TemporaryTask oneTC3 = new TemporaryTask
                ("Оштукатурить фундамент", 7, "Дача", "01.07.2019");
        oneTC3.setDescription("ilmax 6800 ЗИМА");
        category3.getTemporaryTaskList().add(oneTC3);

        EverydayTask oneEC3 = new EverydayTask("Утренняя пробежка", 7);
        oneEC3.setSuccessfulExecution(15);
        oneEC3.setUnsuccessfulExecution(0);
        category3.getEverydayTaskList().add(oneEC3);

        Category category4 = new Category("Здоровье", "WHITE");
        RequiredTask oneC4 = new RequiredTask("Выпить воду", 10, "ЗОЖ");
        oneC4.setDescription("1,5 - 2 л в день");
        category4.getRequiredTaskList().add(oneC4);

        categoryList_2.add(category);
        categoryList_2.add(category2);
        categoryList_2.add(category3);
        categoryList_2.add(category4);

        JsonSave.saveFile("json2",categoryList_2);

        idTaskJSON_2 = Task.getIdTask();
    }

    public static List<Category> getCategoryList_2() {
        return categoryList_2;
    }

    public static int getIdTaskJSON_2() {
        return idTaskJSON_2;
    }
}