package solid.openClosedPrinciple.good;

class GasolineCar extends Car {
    public GasolineCar(String model) {
        super(model);
    }

    @Override
    public String startEngine() {
        return "Activating gasoline motor";
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public double calculateTopSpeed() {
        return 180.0;
    }
}