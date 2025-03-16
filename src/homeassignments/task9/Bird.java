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

    public String getKind() {
        return kind;
    }

    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public String toString() {
        return("Птица -> "
                + super.toString()
                + ", Семейство: " + kind
                + ", Максимальная высота полёта: " + maxFlightAltitude);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Bird bird = (Bird) obj;
        return  kind.equals(bird.getKind())
                && maxFlightAltitude == bird.getMaxFlightAltitude()
                && getColor().equals(bird.getColor())
                && getMaxLifespan() == bird.getMaxLifespan()
                && getFoodType().equals(bird.getFoodType());
    }

    public int hashCode () {
        return getColor().hashCode() + getMaxLifespan() + getFoodType().hashCode() + kind.hashCode() + maxFlightAltitude*10;
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