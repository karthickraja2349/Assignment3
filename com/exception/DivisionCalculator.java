import java.util.Scanner;

public class DivisionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();

        try {
            double result = divide(numerator, denominator);
            System.out.printf("Result: %.2f%n", result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Thank you for using the Division Calculator.");
            scanner.close();
        }
    }

    public static double divide(double num, double denom) {
        return num / denom; 
    }
}
