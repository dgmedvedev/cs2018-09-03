package lesson4;

public class PatientTestDrive {
    public static void main(String[] args) {
        Patient pat1 = new Patient("Иванов", "Иван", "Иванович", 10, "здоров");
        Patient pat2 = new Patient("Петров", "Петр", 20, "здоров");
        Patient pat3 = new Patient("Сидоров", "Сидор", 30, "здоров");

        System.out.println(Patient.getCountPatient());
    }
}