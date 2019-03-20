package lesson16.task16_1.people16_1;

public class Professor extends Man {
    private String experience;
    private String discipline;

    Professor(String name, String experience, String discipline) {
        super(name);
        this.experience = experience;
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Профессор " + getName() +
                ", обладающий опытом: \"" + getExperience() + "\"" +
                ", преподает дисциплину " + getDiscipline();
    }

    public String getExperience() {
        return experience;
    }

    public String getDiscipline() {
        return discipline;
    }
}
