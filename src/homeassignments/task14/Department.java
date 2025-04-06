package homeassignments.task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String departmentName;
    private Set<Ward> wards;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        wards = new HashSet<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }

    @Override
    public String toString() {
        return "Отделение: " + departmentName;
    }

    public int patientsCountByMale(Sex patientSex) {
        int count = 0;
        for (Ward ward: wards) {
            if (ward.getWardType() == patientSex) {
                count += ward.getPatients().size();
            }
        }
        return count;
    }
}