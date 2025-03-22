package homeassignments.task11;

public interface Robot {

    public default void repair() {
        System.out.println("Теперь я в строю!");
    }

    public abstract void switchOn();
    public abstract void switchOff();
    public abstract void demonstrateUniquePossibilities();
}