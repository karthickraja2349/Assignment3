package vehicle;
public abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void start();

    public abstract void stop();

    public String getDetails() {
        return "Brand: " + brand + ", Model: " + model;
    }
}
