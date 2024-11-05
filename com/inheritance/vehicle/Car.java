package vehicle;
public class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Car " + getDetails() + " is starting with a roar!");
    }

    @Override
    public void stop() {
        System.out.println("Car " + getDetails() + " is stopping.");
    }
}
