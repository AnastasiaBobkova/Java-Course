package homeassignments.task13;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Пётр", "Петров", "01-01-1991", "Минск", 9);
        Student student2 = new Student("Иван", "Иванов", "02-02-1992", "Могилёв", 8);
        Student student3 = new Student("Василий", "Васильев", "03-03-1993", "Витебск", 7);
        Student student4 = new Student("Николай", "Николаев", "04-04-1994", "Брест", 10);
        Student student5 = new Student("Антон", "Антонов", "05-05-1995", "Гродно", 6);
        Group group1 = new Group(1);
        Group group2 = new Group(2);
        Faculty faculty1 = new Faculty("Инновационной подготовки");
        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group2.addStudent(student5);
        faculty1.addGroup(group1);
        faculty1.addGroup(group2);
        System.out.println(group1 + " , Количество студентов = " + group1.getNumOfGroupStudents());
        System.out.println(group2 + " , Количество студентов = " + group2.getNumOfGroupStudents());
        group1.removeStudentsByMark(9);
        group2.removeStudentsByMark(9);
        System.out.println("После удаления студентов, средний балл которых ниже 9: ");
        System.out.println(group1 + " , Количество студентов = " + group1.getNumOfGroupStudents());
        System.out.println(group2 + " , Количество студентов = " + group2.getNumOfGroupStudents());
        group2.transferToGroup(group1);
        System.out.println("После перемещения студентов: ");
        System.out.println(group1 + " , Количество студентов = " + group1.getNumOfGroupStudents());
        System.out.println(group2 + " , Количество студентов = " + group2.getNumOfGroupStudents());
        System.out.println(group1 + " , Средний балл группы = " + group1.averageGroupMark());
        System.out.println(faculty1 + ", Количество студентов на факультете = " + faculty1.getNumOfFacultyStudents());
        faculty1.changeFacultyStatus();
        System.out.println("После изменения статуса факультета: ");
        System.out.println(faculty1);
        System.out.println("Сортировка студентов факультета по возрастанию среднего балла: ");
        faculty1.showFacultyStudents(faculty1.sortFacultyStudentsByMark());
        System.out.println("Сортировка студентов по убыванию среднего балла: ");
        faculty1.showFacultyStudents(faculty1.sortFacultyStudentsByMarkReverse());
    }
}