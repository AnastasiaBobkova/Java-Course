package homeassignments.task9;

public class Animal {

    private int id;
    private String color;
    private int maxLifespan;
    private String foodType;

    public Animal() {
    }

    public Animal(String color, int maxLifespan, String foodType) {
        this.color = color;
        this.maxLifespan = maxLifespan;
        this.foodType = foodType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public int getMaxLifespan() {
        return maxLifespan;
    }

    public String getFoodType() {
        return foodType;
    }

    public String toString() {
        return("Номер: " + id
                + ", Цвет: " + color
                + ", Максимальная продолжительность жизни: " + maxLifespan
                + ", Пища: " + foodType);
    }

    public void makeSound() {
        System.out.println("Животное издаёт звуки.");
    }
    public void play() {
        System.out.println("Животное играет.");
    }
}