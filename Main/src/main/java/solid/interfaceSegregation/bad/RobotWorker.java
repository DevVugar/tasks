package solid.interfaceSegregation.good;

public class RobotWorker implements Worker {
    public void work() { System.out.println("Robot working"); }
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
    public void sleep() {
        throw new UnsupportedOperationException("Robots don't sleep");
    }
}