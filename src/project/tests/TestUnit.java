package project.tests;

import org.junit.Test;
import project.JoinLists;
import project.category.Category;
import project.menu.P_09;
import project.tasks.EverydayTask;
import project.tasks.RequiredTask;
import project.tasks.TemporaryTask;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestUnit {

    private Category category = new Category("Test", "GREEN");

    private RequiredTask oneR = new RequiredTask("Запись первая", 9, "Семья");
    private RequiredTask twoR = new RequiredTask("Запись вторая", 8, "Финансы");
    private TemporaryTask oneT = new TemporaryTask
            ("Запись третья", 5, "Финансы", "01.01.2021");
    private TemporaryTask twoT = new TemporaryTask
            ("Запись четвертая", 6, "Семья", "01.06.2019");
    private EverydayTask oneE = new EverydayTask("Запись пятая", 9);
    private EverydayTask twoE = new EverydayTask("Запись шестая", 7);

    private Category category2 = new Category("Тест", "ЗЕЛЕНЫЙ");

    private RequiredTask oneR2 = new RequiredTask("Запись седьмая", 5, "Семья");
    private TemporaryTask oneT2 = new TemporaryTask
            ("Запись восьмая", 5, "Финансы", "01.01.2021");
    private EverydayTask oneE2 = new EverydayTask("Запись девятая", 5);

    private String subcategory = "Семья";

    @Test
    public void addTask() {
        assertTrue(category.getRequiredTaskList().add(oneR));
        assertTrue(category.getTemporaryTaskList().add(oneT));
        assertTrue(category.getEverydayTaskList().add(oneE));
    }

    @Test
    public void getRating() {
        addTasksCategory1();
        addTasksCategory2();
        assertEquals(9, category.getRequiredTaskList().get(0).getRating());
        assertEquals(5, category2.getRequiredTaskList().get(0).getRating());
    }

    @Test
    public void All() {
        addLists();
        assertEquals(59, P_09.sumRatingAll());
        assertEquals(20, P_09.sumRatingAll(subcategory));
        assertEquals(9, (int)P_09.countTasksAll());
        assertEquals(3, (int)P_09.countTasksAll(subcategory));
    }

    @Test
    public void sumRatingAllSubcategory() {

    }

    @Test
    public void sumRating() {
        addTasksCategory1();
        addTasksCategory2();
        assertEquals(44, P_09.sumRating(category));
        assertEquals(15, P_09.sumRating(category2));
    }

    @Test
    public void sumRatingSubcategory() {
        addTasksCategory1();
        addTasksCategory2();
        assertEquals(15, P_09.sumRating(category,subcategory));
        assertEquals(5, P_09.sumRating(category2,subcategory));
    }

    @Test
    public void countTasks() {
        addTasksCategory1();
        addTasksCategory2();
        assertEquals(6, (int)P_09.countTasks(category));
        assertEquals(3, (int)P_09.countTasks(category2));
    }

    @Test
    public void countTasksSubcategory() {
        addTasksCategory1();
        addTasksCategory2();
        assertEquals(2, (int)P_09.countTasks(category,subcategory));
        assertEquals(1, (int)P_09.countTasks(category2,subcategory));
    }

    private void addTasksCategory1(){
        category.getRequiredTaskList().add(oneR);
        category.getRequiredTaskList().add(twoR);
        category.getTemporaryTaskList().add(oneT);
        category.getTemporaryTaskList().add(twoT);
        category.getEverydayTaskList().add(oneE);
        category.getEverydayTaskList().add(twoE);
    }

    private void addTasksCategory2(){
        category2.getRequiredTaskList().add(oneR2);
        category2.getTemporaryTaskList().add(oneT2);
        category2.getEverydayTaskList().add(oneE2);
    }

    private void addLists(){
        addTasksCategory1();
        addTasksCategory2();
        JoinLists.getCategoryList().add(category);
        JoinLists.getCategoryList().add(category2);
    }
}