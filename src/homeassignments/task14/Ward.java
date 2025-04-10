package homeassignments.task14;

import java.util.Set;
import java.util.TreeSet;

public class Ward {
    private int wardNumber;
    private Sex wardType;
    private String wardDiagnosis;
    private int wardCapacity;
    private Set<Patient> patients;

    public Ward(int wardNumber, Sex wardType) {
        this.wardNumber = wardNumber;
        this.wardType = wardType;
        wardCapacity = 3;
        patients = new TreeSet<>();
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(int wardNumber) {
        this.wardNumber = wardNumber;
    }

    public Sex getWardType() {
        return wardType;
    }

    public void setWardType(Sex wardType) {
        if (this.wardType != wardType) {
            if (patients.isEmpty()) {
                this.wardType = wardType;
            } else {
                System.out.println("Тип палаты не может быть изменён. В палате уже есть пациенты " + wardType.getValue() + " пола. ");
            }
        }
    }

    public int getWardCapacity() {
        return wardCapacity;
    }

    public void setWardCapacity(int wardCapacity) {
        this.wardCapacity = wardCapacity;
    }

    public String getWardDiagnosis() {
        return wardDiagnosis;
    }

    private void setWardDiagnosis(String wardDiagnosis) {
        this.wardDiagnosis = wardDiagnosis;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return "Палата №" + wardNumber
                + " , пол: " + wardType.getValue()
                + ", диагноз: " + wardDiagnosis
                + ", мест в палате: " + wardCapacity;
    }

    public void addPatient (Patient patient) {
        if (isWardFull()) {
            System.out.println(patient + " не может быть добавлен в палату. " +
                    "Максимальное количество пациентов в палате " + getWardCapacity());
        } else if (patient.getPatientSex() != wardType) {
            System.out.println(patient + " не может быть добавлен в палату. " +
                    "В палате лежат пациенты пола " + wardType.getValue());
        } else if (patients.isEmpty()){
            patients.add(patient);
            setWardDiagnosis(patient.getDiagnosis());
        } else if (patient.getDiagnosis() != wardDiagnosis) {
            System.out.println(patient + " не может быть добавлен в палату. " +
                    "В палате лежат пациенты с диагнозом " + wardDiagnosis);
        } else {
            patients.add(patient);
        }
    }

    public boolean isWardFull() {
        return patients.size() == wardCapacity;
    }

    public void showPatients() {
        for(Patient patient : patients) {
            System.out.println(patient);
        }
    }
}