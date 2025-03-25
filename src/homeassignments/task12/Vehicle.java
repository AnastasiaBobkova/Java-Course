package homeassignments.task12;

public class Vehicle {
    private String name;
    private int amountOfEmissions;

    public Vehicle(String name, int amountOfEmissions) {
        this.name = name;
        this.amountOfEmissions = amountOfEmissions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmountOfEmissions(int amountOfEmissions) {
        this.amountOfEmissions = amountOfEmissions;
    }

    public int getAmountOfEmissions() {
        return amountOfEmissions;
    }
}