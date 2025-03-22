package homeassignments.task12;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 80);
        Motorcycle motorcycle = new Motorcycle("Honda", 100);
        Garage<Car> garageForCar = new Garage <>(car);
        Garage<Motorcycle> garageForMoto = new Garage <>(motorcycle);

        System.out.println("Въезд транспортного средства "
                + garageForCar.getVehicleType()
                + " "
                + garageForCar.getVehicle().name
                + " разрешён? "
                + garageForCar.isEntryPermitted());
        System.out.println("Въезд транспортного средства "
                + garageForMoto.getVehicleType()
                + " "
                + garageForMoto.getVehicle().name
                + " разрешён? "
                + garageForMoto.isEntryPermitted());
    }
}