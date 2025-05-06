package solid.interfaceSegregation.bad;
public class HumanWorker implements Worker {
    public void work() { System.out.println("Human working"); }
    public void eat() { System.out.println("Human eating"); }
    public void sleep() { System.out.println("Human sleeping"); }
}

