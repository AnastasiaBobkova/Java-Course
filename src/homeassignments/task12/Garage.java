package homeassignments.task12;

public class Garage <T extends Vehicle> {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public String getVehicleType() {
        if (vehicle instanceof Car) {
            return "Машина";
        } else if (vehicle instanceof Motorcycle) {
            return "Мотоцикл";
        } else {
            return "Не определён";
        }
    }

    Boolean isEntryPermitted () {
        return vehicle.amountOfEmissions < 100;
    }
}