package product;
public class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Book Product: " + getName() + ", Author: " + author;
    }
}
