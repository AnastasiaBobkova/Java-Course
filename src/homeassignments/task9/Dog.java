package homeassignments.task9;

public class Dog extends Animal{

    private String name;
    private String breed;
    private double avgWeight;

    public Dog() {
    }

    public Dog(String color, int maxLifespan, String foodType, String name, String breed, double avgWeight) {
        super(color, maxLifespan, foodType);
        this.name = name;
        this.breed = breed;
        this.avgWeight = avgWeight;
    }

    public String toString() {
        return("Собака -> "
                + super.toString()
                + ", Имя: " + name
                + ", Порода: " + breed
                + ", Средний вес: " + avgWeight);
    }

    public void makeSound() {
        System.out.println(name + " лает.");
    }

    public void bite() {
        System.out.println(name + " кусает.");
    }

    public void run() {
        System.out.println(name + " бегает.");
    }

    public void play() {
        System.out.println(name + " играет.");
    }

    public void jump() {
        System.out.println(name + " прыгает.");
    }
}