package lesson4;

class Patient {
    private String surname;
    private String name;
    private String middleName;
    private int age;
    private String diagnosis;
    private static int countPatient;

    Patient() {
        countPatient++;
    }

    Patient(String surname, String name, int age, String diagnosis) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        countPatient++;
        System.out.println("Пациент " + getSurname() + " " + getName() + " - Возраст = " + getAge());
    }

    Patient(String surname, String name, String middleName, int age, String diagnosis) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.age = age;
        this.diagnosis = diagnosis;
        countPatient++;
        System.out.println("Пациент " + getSurname() + " " + getName() + " " + getMiddleName() + " - Возраст = " + getAge());
    }

    static int getCountPatient() {
        return countPatient;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }
}
