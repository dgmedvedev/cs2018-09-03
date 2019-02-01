package lesson4;

import java.util.Scanner;

class Patient {
    private String fio;
    private int age;
    private String diagnosis;
    private static int countPatient;

    Patient() {
        countPatient++;
        enterInfo();
    }

    Patient(String fio,int age,String diagnosis){
        this.fio = fio;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getAllInfoPatient(){
        return fio + " (возраст: " + age + ", диагноз: " + diagnosis + ")";
    }

    public int getCountPatient() {
        return countPatient;
    }

    public void print() {
        System.out.println("Пациент " + fio + " - Возраст = " + age);
    }

    private void enterInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ФИО пациента № " + countPatient);
        this.fio = sc.nextLine();
        System.out.println("диагноз пациента № " + countPatient);
        this.diagnosis = sc.nextLine();
        System.out.println("возраст пациента № " + countPatient);
        this.age = sc.nextInt();
    }
}