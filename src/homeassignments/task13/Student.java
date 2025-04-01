package homeassignments.task13;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String city;
    private int averageMark;

    public Student(String name, String surname, String dateOfBirth, String city, int averageMark) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.averageMark = averageMark;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Студент: "
                + name + ' '
                + surname + ", "
                + dateOfBirth + ", г."
                + city + ", Средний балл = "
                + averageMark + '.';
    }
}