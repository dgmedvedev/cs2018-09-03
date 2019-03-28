package project.category;

import project.tasks.EverydayTask;
import project.tasks.RequiredTask;
import project.tasks.TemporaryTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Category {
    private static int idCategory;
    private int id;
    private String title;
    private String color;
    private Date creationDate;
    private LinkedList<RequiredTask> requiredTaskList = new LinkedList<>();
    private LinkedList<TemporaryTask> temporaryTaskList = new LinkedList<>();
    private LinkedList<EverydayTask> everydayTaskList = new LinkedList<>();

    public Category(String title, String color) {
        this.title = title;
        this.color = color;
        this.creationDate = new Date();
        this.id = ++idCategory;
    }

    @Override
    public String toString() {
        return "Category{" + '\n' +
                "id=" + id + "," + '\n' +
                "title=" + title + "," + '\n' +
                " color=" + color + "," + '\n' +
                " creationDate=" + getCreationDate() + "," + '\n' +
                "  requiredTaskList=" + requiredTaskList + "," + '\n' +
                "  temporaryTaskList=" + temporaryTaskList + "," + '\n' +
                "  everydayTaskList=" + everydayTaskList +
                '}';
    }

    public static int getIdCategory() {
        return idCategory;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public String getCreationDate() {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        return formatDate.format(creationDate);
    }

    public LinkedList<RequiredTask> getRequiredTaskList() {
        return requiredTaskList;
    }

    public LinkedList<TemporaryTask> getTemporaryTaskList() {
        return temporaryTaskList;
    }

    public LinkedList<EverydayTask> getEverydayTaskList() {
        return everydayTaskList;
    }
}
