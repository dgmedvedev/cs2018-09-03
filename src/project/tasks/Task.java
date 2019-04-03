package project.tasks;

public abstract class Task {
    private static int idTask;
    private int id;
    private String titleTask;
    private String description;
    private int rating;

    Task(String titleTask, int rating) {
        this.titleTask = titleTask;
        this.rating = rating;
        this.id = ++idTask;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", titleTask='" + titleTask + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", ";
    }

    public static void setIdTask(int idTask) {
        Task.idTask = idTask;
    }

    public void setTitleTask(String titleTask) {
        this.titleTask = titleTask;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public static int getIdTask() {
        return idTask;
    }

    public String getTitleTask() {
        return titleTask;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }
}
