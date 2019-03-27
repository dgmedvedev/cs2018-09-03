package project.tasks;

public class TemporaryTask extends Task {
    private String subcategory;
    private String deadline;

    public TemporaryTask(String titleTask, int rating, String subcategory, String deadline) {
        super(titleTask, rating);
        this.subcategory = subcategory;
        this.deadline = deadline;
    }

    @Override
    public String toString() {

        return super.toString() +
                "subcategory=" + subcategory +
                ", deadline=" + deadline +
                '}';
    }

    public String getSubcategory() {
        return subcategory;
    }

    public String getDeadline() {
        return deadline;
    }
}