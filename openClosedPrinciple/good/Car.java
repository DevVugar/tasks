package solid.openClosedPrinciple.good;

abstract class Car {
    protected String model;

    public Car(String model) {
        this.model = model;
    }

    // Behaviors to be overridden
    public abstract String startEngine();
    public abstract String getFuelType();
    public abstract double calculateTopSpeed();
}