package homeassignments.task18.Runnable;

public class Car implements Runnable {
    private String name;
    private String number;
    private int stopTime;

    public Car(String name, String number, int stopTime) {
        this.name = name;
        this.number = number;
        this.stopTime = stopTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getStopTime() {
        return stopTime;
    }

    public void setStopTime(int stopTime) {
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