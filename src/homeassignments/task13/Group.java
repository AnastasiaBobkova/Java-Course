package homeassignments.task13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupNumber;
    private List<Student> students;

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        students = new ArrayList<>();
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Группа #" + groupNumber;
    }

    public void addStudent (Student student) {
        students.add(student);
    }

    public void removeStudentsByMark (int mark) {
        students.removeIf(student -> student.getAverageMark() < mark);
    }

    public double averageGroupMark () {
        int markSum = 0;
        for (Student student: students) {
            markSum += student.getAverageMark();
        }
        return (double) markSum /students.size();
    }

    public void transferToGroup(Group newGroup) {
        if (getNumOfGroupStudents() < 2) {
            newGroup.getStudents().addAll(students);
            students.removeAll(getStudents());
        }
    }

    public int getNumOfGroupStudents () {
        return students.size();
    }
}