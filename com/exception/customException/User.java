package customException;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            AgeValidator.validateAge(age);
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Thank you for using the Age Validator.");
            scanner.close();
        }
    }
}
