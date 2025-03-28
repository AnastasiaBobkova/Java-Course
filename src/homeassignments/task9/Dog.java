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

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAvgWeight() {
        return avgWeight;
    }

    public String toString() {
        return("Собака -> "
                + super.toString()
                + ", Имя: " + name
                + ", Порода: " + breed
                + ", Средний вес: " + avgWeight);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Dog dog = (Dog) obj;
        return name.equals(dog.getName())
                && breed.equals(dog.getBreed())
                && avgWeight == dog.getAvgWeight()
                && getColor().equals(dog.getColor())
                && getMaxLifespan() == dog.getMaxLifespan()
                && getFoodType().equals(dog.getFoodType());
    }

    public int hashCode () {
        return getColor().hashCode() + getMaxLifespan() + getFoodType().hashCode() + name.hashCode() + breed.hashCode() + (int)avgWeight*10;
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