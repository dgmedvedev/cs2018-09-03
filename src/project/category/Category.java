package project.category;

import project.tasks.EverydayTask;
import project.tasks.RequiredTask;
import project.tasks.Task;
import project.tasks.TemporaryTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Category {
    private static int idCategories;
    private int idCategory;
    private String title;
    private String color;
    private String creationDate;
    private LinkedList<Task> requiredTaskList = new LinkedList<>();
    private LinkedList<Task> temporaryTaskList = new LinkedList<>();
    private LinkedList<Task> everydayTaskList = new LinkedList<>();

    public Category(String title, String color) {
        this.title = title;
        this.color = color;
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        this.creationDate = formatDate.format(new Date());
        this.idCategory = ++idCategories;
    }

    @Override
    public String toString() {
        return "Category{" + '\n' +
                "idCategory=" + idCategory + "," + '\n' +
                "title=" + title + "," + '\n' +
                " color=" + color + "," + '\n' +
                " creationDate=" + creationDate + "," + '\n' +
                "  requiredTaskList=" + requiredTaskList + "," + '\n' +
                "  temporaryTaskList=" + temporaryTaskList + "," + '\n' +
                "  everydayTaskList=" + everydayTaskList +
                '}';
    }

    public String toStringCategories() {
        return "Category - " + title + "," + '\n' +
                "  requiredTaskList=" + requiredTaskList + "," + '\n' +
                "  temporaryTaskList=" + temporaryTaskList + "," + '\n' +
                "  everydayTaskList=" + everydayTaskList +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void setIdCategories(int idCategories) {
        Category.idCategories = idCategories;
    }

    public static int getIdCategories() {
        return idCategories;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public LinkedList<Task> getRequiredTaskList() {
        return requiredTaskList;
    }

    public LinkedList<Task> getTemporaryTaskList() {
        return temporaryTaskList;
    }

    public LinkedList<Task> getEverydayTaskList() {
        return everydayTaskList;
    }
}
