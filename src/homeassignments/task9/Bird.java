package homeassignments.task9;

public class Bird extends Animal{

    private String kind;
    private int maxFlightAltitude;

    public Bird() {
    }

    public Bird(String color, int maxLifespan, String foodType, String kind, int maxFlightAltitude) {
        super(color, maxLifespan, foodType);
        this.kind = kind;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public String toString() {
        return("Птица -> "
                + super.toString()
                + ", Семейство: " + kind
                + ", Максимальная высота полёта: " + maxFlightAltitude);
    }

    public void makeSound() {
        System.out.println(kind + " поёт.");
    }

    public void peck() {
        System.out.println(kind + " клюёт.");
    }

    public void hatch() {
        System.out.println(kind + " высиживает птенцов.");
    }

    public void play() {
        System.out.println(kind + " играет.");
    }
}