package homeassignments.task11;

public class Main {
    public static void main(String[] args) {
        RobotCook robotCook = new RobotCook("MODEL-12COOK", 80, "Япония", "Плита", true );
        RobotSapper robotSapper = new RobotSapper("MODEL-01SAP", 100, "CN-01SP33", "Алюминий", true);
        RobotBuilder robotBuilder = new RobotBuilder("MODEL-02BLD",90,"Австралия", "Бетон","Сталь", true);

        System.out.println("Отремонтируем роботов.");
        System.out.println(robotCook);
        robotCook.repair();
        System.out.println(robotSapper);
        robotSapper.repair();
        System.out.println(robotBuilder);
        robotBuilder.repair();

        Robot[] allTypesRobots = new Robot[3];
        allTypesRobots[0] = robotCook;
        allTypesRobots[1] = robotSapper;
        allTypesRobots[2] = robotBuilder;

        System.out.println("\nВсе виды роботов:");
        showPossibilities(allTypesRobots);

        RobotEngineer[] engineerRobots = new RobotEngineer[2];
        engineerRobots[0] = new RobotSapper("MODEL-02SAP", 110, "CN-02SP44", "Сталь", true);
        engineerRobots[1] = new RobotBuilder("MODEL-03BLD",85,"Канада", "Дерево","Кевлар", true);

        System.out.println("\nРоботы-инженеры:");
        showPossibilities(engineerRobots);

        RobotSapper[] sapperRobots = new RobotSapper[2];
        sapperRobots[0] = new RobotSapper("MODEL-03SAP", 115, "CN-03SP55", "Алюминий", true);
        sapperRobots[1] = new RobotSapper("MODEL-04SAP", 90, "CN-04SP66", "Резина", true);

        System.out.println("\nРоботы-сапёры:");
        showPossibilities(sapperRobots);

        System.out.println("\nУникальные способности роботов-инженеров:");
        for (RobotEngineer engineerRobot : engineerRobots) {
            engineerRobot.createItem();
        }
    }

    public static void showPossibilities (Robot[] robots) {
        for (Robot robot : robots) {
            robot.demonstrateUniquePossibilities();
        }
    }
}