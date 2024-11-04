import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long phoneNumber = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter your phone number: ");
            try {
                phoneNumber = scanner.nextLong();
                if (String.valueOf(phoneNumber).length() != 10) {
                    throw new InputMismatchException("Phone number must be 10 digits long.");
                }
                validInput = true;
                System.out.println("Phone number entered successfully: " + phoneNumber);
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage() + " Please enter a valid phone number.");
                scanner.nextLine(); 
            }
        }

        System.out.println("Thank you for using the Phone Number Input program.");
        scanner.close();
    }
}
