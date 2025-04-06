package homeassignments.task14;

import java.util.Objects;

public class Patient implements Comparable<Patient> {
    private Integer patientId;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Sex patientSex;

    public Patient(int patientId, String name, String surname, String diagnosis, int age, Sex patientSex) {
        this.patientId = patientId;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.patientSex = patientSex;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(Sex patientSex) {
        this.patientSex = patientSex;
    }

    @Override
    public String toString() {
        return "Пациент ID:" + patientId
                + " " + name
                + " " + surname
                + ", диагноз: " + diagnosis
                + ", возраст: " + age
                + ", пол: " + patientSex.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return getAge() == patient.getAge() && Objects.equals(getPatientId(), patient.getPatientId()) && Objects.equals(getName(), patient.getName()) && Objects.equals(getSurname(), patient.getSurname()) && Objects.equals(getDiagnosis(), patient.getDiagnosis()) && getPatientSex() == patient.getPatientSex();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatientId(), getName(), getSurname(), getDiagnosis(), getAge(), getPatientSex());
    }

    @Override
    public int compareTo(Patient patient) {
        return this.patientId.compareTo(patient.patientId);
    }
}