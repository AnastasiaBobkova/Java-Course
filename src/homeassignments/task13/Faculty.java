package homeassignments.task13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Group> groups;
    private Status facultyStatus;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        groups = new ArrayList<>();
        facultyStatus = Status.ACTIVE;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Status getFacultyStatus() {
        return facultyStatus;
    }

    public void setFacultyStatus(Status facultyStatus) {
        this.facultyStatus = facultyStatus;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Факультет " + facultyName +
                ", Статус: " + facultyStatus.getValue();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public int getNumOfFacultyStudents () {
        int numOfFacultyStudents = 0;
        for (Group group : groups) {
            numOfFacultyStudents += group.getNumOfGroupStudents();
        }
        return numOfFacultyStudents;
    }

    public void changeFacultyStatus () {
        if (getNumOfFacultyStudents() < 20) {
            setFacultyStatus(Status.NOT_ACTIVE);
        } else {
            setFacultyStatus(Status.ACTIVE);
        }
    }

    public List<Student> getFacultyStudents () {
        List<Student> facultyStudents = new ArrayList<>();
        for (Group group : groups) {
            facultyStudents.addAll(group.getStudents());
        }
        return facultyStudents;
    }

    public List<Student> sortFacultyStudentsByMark () {
        List<Student> facultyStudents = getFacultyStudents();
        StudentMarkComparator markComparator = new StudentMarkComparator();
        facultyStudents.sort(markComparator);
        return facultyStudents;
    }

    public List<Student> sortFacultyStudentsByMarkReverse () {
        return sortFacultyStudentsByMark().reversed();
    }

    public void showFacultyStudents (List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}