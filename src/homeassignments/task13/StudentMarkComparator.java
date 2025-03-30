package homeassignments.task13;

import java.util.Comparator;

public class StudentMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getAverageMark() - student2.getAverageMark();
    }
}