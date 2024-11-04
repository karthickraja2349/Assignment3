package product;
public class ElectronicsProduct extends Product {
    private String brand;

    public ElectronicsProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String getDescription() {
        return "Electronics Product: " + getName() + ", Brand: " + brand;
    }
}
