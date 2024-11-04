package vehicle;
public class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle " + getDetails() + " is starting with a vroom!");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle " + getDetails() + " is stopping.");
    }
}
