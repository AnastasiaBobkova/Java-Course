package homeassignments.task11;

public class RobotSapper implements RobotEngineer {
    String model;
    int power;
    String chassisNumber;
    String material;
    boolean isOn;

    public RobotSapper(String model, int power, String chassisNumber, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.chassisNumber = chassisNumber;
        this.material = material;
        this.isOn = isOn;
    }

    public String toString() {
        return "Робот-сапёр: " +
                "модель = '" + model + '\'' +
                ", потребляемая мощность = " + power +
                ", средство для разминирования = '" + chassisNumber + '\'' +
                ", материал = '" + material + '\'' +
                ", флаг включения = " + isOn +
                '.';
    }

    @Override
    public void repair() {
        System.out.println("Готов обезвреживать!");
    }

    public void switchOn() {
        if (isOn) {
            System.out.println("Робот уже включён.");
        }
        else {
            isOn = true;
        }
    }
    public void switchOff() {
        if (!isOn) {
            System.out.println("Робот уже выключен.");
        }
        else {
            isOn = false;
        }
    }
    public void demonstrateUniquePossibilities() {
        System.out.println("Сапёр обезвреживает снаряды.");
    }

    @Override
    public void createItem() {
        System.out.println("Приспособление для разминирования создано.");
    }
}