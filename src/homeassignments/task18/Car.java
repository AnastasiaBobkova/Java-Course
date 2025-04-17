package homeassignments.task18;

public class Car extends Thread {
    private String name;
    private String number;
    private int stopTime;

    public Car(String name, String number, int stopTime) {
        this.name = name;
        this.number = number;
        this.stopTime = stopTime;
    }

    public void move() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(stopTime);
            System.out.println("Машина " + name + " едет.");
        }
    }

    @Override
    public void run() {
        try {
            move();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}