package homeassignments.task7;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private int course;
    private String group;
    private int mark;

    Student() {
        id = 0;
        name = "defaultStudentName";
        surname = "defaultStudentSurname";
        faculty = "default";
        course = 0;
        group = "default";
        mark = 0;
    }

    Student (int id, String name, String surname, String faculty, int course, String group, int mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.mark = mark;
    }

    public void info() {
        System.out.println("Student #" + id + ": name = " + name + ", surname = " + surname + ", faculty = "
                + faculty + ", course = " + course + ", group = " + group + ", mark = " + mark);
    }

    public void changeInfo (String group) {
        this.group = group;
    }

    public void changeInfo (String group, int mark) {
        this.group = group;
        this.mark = mark;
    }

    public String getGroup() {
        return group;
    }

    public Student[] getStudents (Student[] students,int mark){
        int i = 0;
        for (Student student : students) {
            if (student.mark > mark) {
                i++;
            }
        }
        Student[] bestStudents = new Student[i];
        int j = 0;
        for (Student student:students) {
            if (student.mark > mark) {
                bestStudents[j] = student;
                j++;
            }
        }
        return bestStudents;
    }
}