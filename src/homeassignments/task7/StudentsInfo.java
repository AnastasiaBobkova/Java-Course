package homeassignments.task7;

public class StudentsInfo {
    public static void main(String[] args) {
        int numberOfStudents = 5;
        Student[] myStudents = new Student[numberOfStudents];
        myStudents[0] = new Student(1, "Ivan", "Ivanov", "MIR", 4, "UIR", 5);
        myStudents[1] = new Student(2, "Petr", "Petrov", "KVN", 3, "KSIS", 4);
        myStudents[2] = new Student(3, "Fedor", "Fedorov", "ABS", 2, "EYS", 3);
        myStudents[3] = new Student(4, "Viktor", "Viktorov", "ABS", 5, "DL", 5);
        myStudents[4] = new Student(5, "Vasilii", "Vasiliev", "MIR", 4, "KSH", 2);
        int passMark = 4;
        Student[] myBestStudents = myStudents[0].getStudents(myStudents,passMark);
        for (Student student : myBestStudents) {
            student.info();
        }
    }
}