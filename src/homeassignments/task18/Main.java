package homeassignments.task18;

public class Main {
    public static void main(String[] args) {
        showStartThread();
        showJoin();
    }

    public static void showStartThread() {
        Car car1 = new Car("BMW", "11111 AA-1", 100);
        Car car2 = new Car("Honda", "22222 BB-2", 100);
        car1.start();
        car2.start();
    }

    public static void showJoin() {
        Car car1 = new Car("Porsche", "33333 AA-3", 1000);
        Car car2 = new Car("Volkswagen", "44444 BB-4", 1000);
        Car car3 = new Car("Toyota", "55555 CC-5", 1000);

        try {
            car1.start();
            car1.join();
            car2.start();
            car3.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}