package homeassignments.task17;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String model;
    private int maxSpeed;
    private String country;

    public Car(String model, int maxSpeed, String country) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getMaxSpeed() == car.getMaxSpeed() && Objects.equals(getModel(), car.getModel()) && Objects.equals(getCountry(), car.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getMaxSpeed(), getCountry());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}