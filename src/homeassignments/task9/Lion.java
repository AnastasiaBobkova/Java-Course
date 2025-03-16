package homeassignments.task9;

public class Lion extends Animal {
    private String kind;

    public Lion() {
    }

    public Lion(String color, int maxLifespan, String foodType, String kind) {
        super(color, maxLifespan, foodType);
        this.kind = kind;
    }

    public String toString() {
        return("Лев -> "
                + super.toString()
                + ", Вид: " + kind);
    }

    public void makeSound() {
        System.out.println(kind + " рычит.");
    }

    public void play() {
        System.out.println(kind + " играет.");
    }
}