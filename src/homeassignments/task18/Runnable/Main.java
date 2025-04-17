package homeassignments.task18.Runnable;

public class Main {
    public static void main(String[] args) {
        showStartThread();
        showJoin();
    }

    public static void showStartThread() {
        Car car1 = new Car("BMW", "11111 AA-1", 100);
        Car car2 = new Car("Honda", "22222 BB-2", 100);
        Thread car1Thread = createCarThread(car1);
        Thread car2Thread = createCarThread(car2);
        car1Thread.start();
        car2Thread.start();
    }

    public static void showJoin() {
        Car car1 = new Car("Porsche", "33333 AA-3", 1000);
        Car car2 = new Car("Volkswagen", "44444 BB-4", 1000);
        Car car3 = new Car("Toyota", "55555 CC-5", 1000);
        Thread car1Thread = createCarThread(car1);
        Thread car2Thread = createCarThread(car2);
        Thread car3Thread = createCarThread(car3);

        try {
            car1Thread.start();
            car1Thread.join();
            car2Thread.start();
            car3Thread.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static Thread createCarThread(Car car) {
        return new Thread(car);
    }
}