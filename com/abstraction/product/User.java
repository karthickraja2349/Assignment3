package product;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.print("Enter product type (1 for Electronics, 2 for Clothing, 3 for Book, 0 to stop): ");
            int type = scanner.nextInt();
            scanner.nextLine();

            if (type == 0) {
                break;
            }

            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();

            if (type == 1) {
                System.out.print("Enter brand: ");
                String brand = scanner.next();
                cart.addProduct(new ElectronicsProduct(name, price, brand));
            } else if (type == 2) {
                System.out.print("Enter size: ");
                String size = scanner.next();
                cart.addProduct(new ClothingProduct(name, price, size));
            } else if (type == 3) {
                System.out.print("Enter author: ");
                String author = scanner.next();
                cart.addProduct(new BookProduct(name, price, author));
            } else {
                System.out.println("Invalid product type. Please try again.");
            }
        }

        System.out.println("\nShopping Cart Contents:");
        cart.displayProducts();
        System.out.printf("Total Price: $%.2f%n", cart.calculateTotalPrice());

        scanner.close();
    }
}

