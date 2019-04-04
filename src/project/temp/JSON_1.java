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

public class JSON_1 {
    private static List<Category> categoryList_1 = new LinkedList<>();
    private static int idTaskJSON_1;

    public static void start() {
        Category.setIdCategories(0);
        Task.setIdTask(0);

        Category category = new Category("Быт", "yellow");
        RequiredTask one = new RequiredTask("Записать сына к врачу", 10, "Семья");
        one.setDescription("оториноларинголог");
        RequiredTask two = new RequiredTask("Оплатить кредит", 9, "Финансы");
        two.setDescription("до 27-го числа");
        RequiredTask three = new RequiredTask("Оплатить страховку", 9, "Финансы");
        three.setDescription("до 16.04.2019");
        RequiredTask four = new RequiredTask("Гарантийный осмотр", 9, "Авто");
        four.setDescription("до 45000 км");
        RequiredTask five = new RequiredTask("Заменить масло ДВС", 9, "Авто");
        five.setDescription("до 38000 км");
        category.getRequiredTaskList().add(one);
        category.getRequiredTaskList().add(two);
        category.getRequiredTaskList().add(three);
        category.getRequiredTaskList().add(four);
        category.getRequiredTaskList().add(five);

        TemporaryTask oneT = new TemporaryTask
                ("Купить ноутбук", 6, "Финансы", "01.01.2020");
        oneT.setDescription("HP Pavilion 15-cs1016ur 5HA04EA");
        TemporaryTask twoT = new TemporaryTask
                ("Заехать к родителям перед отпуском", 7, "Семья", "01.07.2019");
        twoT.setDescription("Рыбы и цветы");
        category.getTemporaryTaskList().add(oneT);
        category.getTemporaryTaskList().add(twoT);

        EverydayTask oneE = new EverydayTask("Забрать ребенка из сада", 10);
        oneE.setSuccessfulExecution(1111);
        EverydayTask twoE = new EverydayTask("Покормить рыб", 7);
        twoE.setSuccessfulExecution(888);
        twoE.setUnsuccessfulExecution(50);
        twoE.setDescription("кроме субботы");
        EverydayTask threeE = new EverydayTask("Полить цветы", 7);
        threeE.setSuccessfulExecution(7777);
        threeE.setUnsuccessfulExecution(777);
        category.getEverydayTaskList().add(oneE);
        category.getEverydayTaskList().add(twoE);
        category.getEverydayTaskList().add(threeE);

        Category category2 = new Category("Работа", "red");
        RequiredTask oneC2 = new RequiredTask("4-тэк топливо", 10, "Отчеты");
        oneC2.setDescription("квартальный");
        RequiredTask twoC2 = new RequiredTask("экономия СНП", 10, "Отчеты");
        twoC2.setDescription("квартальный");
        RequiredTask threeC2 = new RequiredTask("Письмо в Минтранс", 9, "Списание ОС");
        threeC2.setDescription("На списание вагонов");
        RequiredTask fourC2 = new RequiredTask("Гарантийный осмотр", 9, "Авто");
        fourC2.setDescription("BMW до 30000 км");
        category2.getRequiredTaskList().add(oneC2);
        category2.getRequiredTaskList().add(twoC2);
        category2.getRequiredTaskList().add(threeC2);
        category2.getRequiredTaskList().add(fourC2);

        TemporaryTask oneTC2 = new TemporaryTask
                ("Замена а/шин", 6, "Авто", "15.04.2019");
        oneTC2.setDescription("отчет после 100% замены");
        TemporaryTask twoTC2 = new TemporaryTask
                ("Счет на резку вагонов", 6, "Списание ОС", "15.04.2019");
        twoTC2.setDescription("Гомельвторчермет");
        category2.getTemporaryTaskList().add(oneTC2);
        category2.getTemporaryTaskList().add(twoTC2);

        EverydayTask oneEC2 = new EverydayTask("Инфо по вагонам", 7);
        oneEC2.setSuccessfulExecution(11000);
        EverydayTask twoEC2 = new EverydayTask("Проверить остаток счета на топливо", 6);
        twoEC2.setSuccessfulExecution(10000);
        twoEC2.setUnsuccessfulExecution(1000);
        twoEC2.setDescription("пополнить, если меньше 500 рублей");
        EverydayTask threeEC2 = new EverydayTask("Редактирование отчета на списание материалов", 5);
        threeEC2.setSuccessfulExecution(9000);
        threeEC2.setUnsuccessfulExecution(2000);
        category2.getEverydayTaskList().add(oneEC2);
        category2.getEverydayTaskList().add(twoEC2);
        category2.getEverydayTaskList().add(threeEC2);

        Category category3 = new Category("Отпуск", "green");
        RequiredTask oneC3 = new RequiredTask("Забронировать путевку", 10, "Relax");
        oneC3.setDescription("до 01.05.2019");
        RequiredTask twoC3 = new RequiredTask("Ремонт крыши", 8, "Дача");
        twoC3.setDescription("до 01.05.2019:)");
        category3.getRequiredTaskList().add(oneC3);
        category3.getRequiredTaskList().add(twoC3);

        TemporaryTask oneTC3 = new TemporaryTask
                ("Аквапарк", 6, "Relax", "10.05.2019");
        oneTC3.setDescription("проверить скидки на slivki.by");
        TemporaryTask twoTC3 = new TemporaryTask
                ("Оштукатурить фундамент", 5, "Дача", "01.06.2019");
        twoTC3.setDescription("ilmax 6800 ЗИМА");
        category3.getTemporaryTaskList().add(oneTC3);
        category3.getTemporaryTaskList().add(twoTC3);

        EverydayTask oneEC3 = new EverydayTask("Утренняя пробежка", 8);
        oneEC3.setSuccessfulExecution(20);
        oneEC3.setUnsuccessfulExecution(5);
        category3.getEverydayTaskList().add(oneEC3);

        categoryList_1.add(category);
        categoryList_1.add(category2);
        categoryList_1.add(category3);

        JsonSave.saveFile("json1",categoryList_1);

        idTaskJSON_1 = Task.getIdTask();
    }

    public static List<Category> getCategoryList_1() {
        return categoryList_1;
    }

    public static int getIdTaskJSON_1() {
        return idTaskJSON_1;
    }
}