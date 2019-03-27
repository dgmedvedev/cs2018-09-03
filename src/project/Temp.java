package project;

import project.category.Category;
import project.tasks.EverydayTask;
import project.tasks.RequiredTask;
import project.tasks.TemporaryTask;

public class Temp {
    public static void start() {
        Category category = new Category("Быт");
        RequiredTask one = new RequiredTask("Записать сына к врачу", 10, "Семья");
        RequiredTask two = new RequiredTask("Оплатить кредит", 9, "Финансы");
        RequiredTask three = new RequiredTask("Оплатить страховку", 9, "Финансы");
        RequiredTask four = new RequiredTask("Гарантийный осмотр", 9, "Авто");
        RequiredTask five = new RequiredTask("Заменить ГРМ", 9, "Авто");
        category.getRequiredTaskList().add(one);
        category.getRequiredTaskList().add(two);
        category.getRequiredTaskList().add(three);
        category.getRequiredTaskList().add(four);
        category.getRequiredTaskList().add(five);

        TemporaryTask oneT = new TemporaryTask
                ("Купить ноутбук", 6, "Финансы", "01.01.2020");
        TemporaryTask twoT = new TemporaryTask
                ("Заехать к родителям", 7, "Семья", "10.04.2019");
        category.getTemporaryTaskList().add(oneT);
        category.getTemporaryTaskList().add(twoT);

        EverydayTask oneE = new EverydayTask("Забрать ребенка из сада", 10);
        EverydayTask twoE = new EverydayTask("Покормить рыб", 7);
        EverydayTask threeE = new EverydayTask("Полить цветы", 7);
        category.getEverydayTaskList().add(oneE);
        category.getEverydayTaskList().add(twoE);
        category.getEverydayTaskList().add(threeE);


        System.out.println(category.toString());
    }
}