package project.tasks;

public class EverydayTask extends Task {
    private int successfulExecution;
    private int unsuccessfulExecution;

    public EverydayTask(String titleTask, int rating) {
        super(titleTask, rating);
    }

    @Override
    public String toString() {

        return super.toString() +
                "successfulExecution=" + successfulExecution +
                ", unsuccessfulExecution=" + unsuccessfulExecution +
                '}';
    }

    public void setSuccessfulExecution(int successfulExecution) {
        this.successfulExecution = successfulExecution;
    }

    public void setUnsuccessfulExecution(int unsuccessfulExecution) {
        this.unsuccessfulExecution = unsuccessfulExecution;
    }

    public int getSuccessfulExecution() {
        return successfulExecution;
    }

    public int getUnsuccessfulExecution() {
        return unsuccessfulExecution;
    }
}
