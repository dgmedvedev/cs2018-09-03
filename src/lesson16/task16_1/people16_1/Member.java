package lesson16.task16_1.people16_1;

public class Member extends Man {
    private String position;

    Member(String name, String position) {
        super(name);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Сотрудник обслуживающего персонала " + getName() +
                ", должность: " + getPosition();
    }

    public String getPosition() {
        return position;
    }
}