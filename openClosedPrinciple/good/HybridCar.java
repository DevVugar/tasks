package solid.openClosedPrinciple.good;

class HybridCar extends Car {

    public HybridCar(String model) {
        super(model);
    }

    @Override
    public String startEngine() {
        return "Starting hybrid system";
    }

    @Override
    public String getFuelType() {
        return null;
    }

    @Override
    public double calculateTopSpeed() {
        return 0;
    }

}