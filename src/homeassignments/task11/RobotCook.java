package homeassignments.task11;

public class RobotCook implements Robot {
    String model;
    int power;
    String producer;
    String cookMachine;
    boolean isOn;

    public RobotCook(String model, int power, String producer, String cookMachine, boolean isOn) {
        this.model = model;
        this.power = power;
        this.producer = producer;
        this.cookMachine = cookMachine;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "Робот-повар: " +
                "модель = '" + model + '\'' +
                ", потребляемая мощность = " + power +
                ", производитель = '" + producer + '\'' +
                ", агрегат для приготовления = '" + cookMachine + '\'' +
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
        System.out.println("Повар готовит блюда.");
    }
}