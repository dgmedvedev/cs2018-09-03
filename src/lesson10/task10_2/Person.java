package lesson10.task10_2;

public class Person {
    private String surname;
    private String firstName;
    private String middleName;

    Person(String surname,String firstName, String middleName){
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return surname + " " + firstName + " " + middleName;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddlName() {
        return middleName;
    }
}