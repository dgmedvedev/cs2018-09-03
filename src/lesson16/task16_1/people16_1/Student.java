package lesson16.task16_1.people16_1;

public class Student extends Man {
    private String course;
    private String specialization;

    Student(String name, String course, String specialization) {
        super(name);
        this.course = course;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Голодный студент " + getName() +
                " " + getCourse() + "-го курса, обучающийся по специальности " + getSpecialization();
    }

    public String getCourse() {
        return course;
    }

    public String getSpecialization() {
        return specialization;
    }
}
