package project.tasks;

public class RequiredTask extends Task {
    private String subcategory;

    public RequiredTask(String titleTask, int rating, String subcategory) {
        super(titleTask, rating);
        this.subcategory = subcategory;
    }

    @Override
    public String toString() {

        return super.toString() +
                "subcategory=" + subcategory +
                '}';
    }

    public String getSubcategory() {
        return subcategory;
    }
}