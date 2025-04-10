package homeassignments.task14;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "Иван", "Иванов", "Дуоденит", 35, Sex.MALE);
        Patient patient2 = new Patient(2, "Фёдор", "Фёдоров", "Дуоденит", 32, Sex.MALE);
        Patient patient3 = new Patient(3, "Анна", "Герман", "Гастрит", 28, Sex.FEMALE);
        Patient patient4 = new Patient(4, "Ольга", "Захарова", "Аритмия", 59, Sex.FEMALE);
        Patient patient5 = new Patient(5, "Екатерина", "Артемьева", "Аритмия", 63, Sex.FEMALE);
        Patient patient6 = new Patient(6, "Василий", "Васильев", "Дуоденит", 25, Sex.MALE);

        Ward ward1 = new Ward(1, Sex.MALE);
        ward1.addPatient(patient2);
        ward1.addPatient(patient1);
        ward1.addPatient(patient6);

        System.out.println("Пациенты " + ward1);
        ward1.showPatients();

        Ward ward2 = new Ward(2, Sex.FEMALE);
        ward2.addPatient(patient3);

        System.out.println("Пациенты " + ward2);
        ward2.showPatients();

        Ward ward3 = new Ward(3, Sex.FEMALE);
        ward3.addPatient(patient4);
        ward3.addPatient(patient5);

        System.out.println("Пациенты " + ward3);
        ward3.showPatients();

        Set<Ward> wardsGastro = new HashSet<>();
        wardsGastro.add(ward1);
        wardsGastro.add(ward2);

        Set<Ward> wardsCardio = new HashSet<>();
        wardsCardio.add(ward3);

        Department departmentGastro = new Department("Гастрологическое");
        departmentGastro.setWards(wardsGastro);
        Department departmentCardio = new Department("Кардиологическое");
        departmentCardio.setWards(wardsCardio);

        Set<Department> departments = new HashSet<>();
        departments.add(departmentGastro);
        departments.add(departmentCardio);

        for (Department department : departments) {
            System.out.println("Количество женщин в отделении " + department.getDepartmentName()
                    + ": " + department.patientsCountByMale(Sex.FEMALE));
            System.out.println("Количество мужчин в отделении " + department.getDepartmentName()
                    + ": " + department.patientsCountByMale(Sex.MALE));
        }
    }
}