package solid.openClosedPrinciple.bad;

public class Car {
    private String model;
    private String type;

    public Car(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String startEngine() {
       if (type.equals("HYBRID")) {
            return "Starting hybrid system";
        } else {
            return "Starting combustion engine";
        }
    }

    public String getFuelType() {
        if (type.equals("HYBRID")) {
            return "Gasoline + Electricity";
        }
        else {
            return "Gasoline";
        }
    }

    public double calculateTopSpeed() {

        if (type.equals("HYBRID")) {
            return 220.0;
        } else {
            return 200.0;
        }
    }
}