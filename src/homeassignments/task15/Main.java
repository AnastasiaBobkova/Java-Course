package homeassignments.task15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Employee, String> employees = new HashMap<>();
        initializeEmployeesMap(employees);

        String profession = "разработчик";
        int amountOfIncrease = 200;

        System.out.println("Информация о сотрудниках:");
        showEmployeesInfo(employees);
        System.out.println("**************************************************************************************************************");

        raiseSalaryForProfession(employees, profession, amountOfIncrease);

        System.out.println("Информация о сотрудниках после повышения зарплаты сотрудникам профессии " + profession + " на " + amountOfIncrease + ":");
        showEmployeesInfo(employees);
        System.out.println("**************************************************************************************************************");

        Map<String, HashSet<Employee>> newEmployeesMap = transformEmployeesMap(employees);

        System.out.println("Информация о сотрудниках в новом виде:");
        showEmployeesInfoTransformed(newEmployeesMap);
    }

    private static void initializeEmployeesMap(Map<Employee, String> employees) {
        Employee employee1 = new Employee(1, "Иван Иванов", 20, 3500);
        Employee employee2 = new Employee(2, "Фёдор Фёдоров", 35, 3000);
        Employee employee3 = new Employee(3, "Василий Васильев", 31, 4000);
        Employee employee4 = new Employee(4, "Людмила Артемьева", 27, 4100);
        Employee employee5 = new Employee(5, "Галина Викторова", 62, 3800);
        Employee employee6 = new Employee(6, "Егор Захаров", 58, 5000);
        Employee employee7 = new Employee(7, "Снежана Денисова", 19, 5200);
        Employee employee8 = new Employee(8, "Арина Петрова", 44, 3900);

        employees.put(employee1, "разработчик");
        employees.put(employee2, "тестировщик");
        employees.put(employee3, "бизнес-аналитик");
        employees.put(employee4, "системный-аналитик");
        employees.put(employee5, "менеджер проекта");
        employees.put(employee6, "разработчик");
        employees.put(employee7, "разработчик");
        employees.put(employee8, "офис-менеджер");
    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equals(profession)) {
                entry.getKey().setSalary(entry.getKey().getSalary() + amountOfIncrease);
            }
        }
    }

    private static void showEmployeesInfo(Map<Employee, String> employees) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + ", Профессия = " + entry.getValue());
        }
    }

    private static void showEmployeesInfoTransformed(Map<String, HashSet<Employee>> employees) {
        for (Map.Entry<String, HashSet<Employee>> entry : employees.entrySet()) {
            System.out.println("Профессия = " + entry.getKey() + ", Сотрудники: " + entry.getValue());
        }
    }

    private static Map<String, HashSet<Employee>> transformEmployeesMap(Map<Employee, String> employees) {
        HashMap<String, HashSet<Employee>> newEmployeesMap = new HashMap<>();

        HashSet<String> professions = new HashSet<>(employees.values());

        for (String profession : professions) {
            HashSet<Employee> employeesByProfession = new HashSet<>();
            for (Map.Entry<Employee, String> entry : employees.entrySet()) {
                if (entry.getValue().equals(profession)) {
                    employeesByProfession.add(entry.getKey());
                }
            }
            newEmployeesMap.put(profession, employeesByProfession);
        }
        return newEmployeesMap;
    }
}