package homeassignments.task11;

public class RobotBuilder implements RobotEngineer {
    private String model;
    private int power;
    private String producer;
    private String constructionUnit;
    private String material;
    private boolean isOn;

    public RobotBuilder(String model, int power, String producer, String constructionUnit, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.producer = producer;
        this.constructionUnit = constructionUnit;
        this.material = material;
        this.isOn = isOn;
    }

    public String toString() {
        return "Робот-строитель: " +
                "модель = '" + model + '\'' +
                ", потребляемая мощность = " + power +
                ", страна производитель = '" + producer + '\'' +
                ", агрегат для строительства = '" + constructionUnit + '\'' +
                ", материал = '" + material + '\'' +
                ", флаг включения = " + isOn +
                '.';
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
        System.out.println("Строитель строит здания.");
    }

    public void createItem () {
        System.out.println("Бетон для строительства создан.");
    }
}