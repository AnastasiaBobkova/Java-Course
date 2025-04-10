package homeassignments.task15;

import java.util.Objects;

public class Employee {
    private int idNumber;
    private String name;
    private int age;
    private int salary;

    public Employee(int idNumber, String name, int age, int salary) {
        this.idNumber = idNumber;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "ID = " + idNumber +
                ", Имя = '" + name + '\'' +
                ", Возраст = " + age +
                ", Зарплата = " + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getIdNumber() == employee.getIdNumber() && getAge() == employee.getAge() && getSalary() == employee.getSalary() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdNumber(), getName(), getAge(), getSalary());
    }
}
