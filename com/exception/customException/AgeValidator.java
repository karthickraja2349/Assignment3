package customException;
public class AgeValidator {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 150.");
        } 
        else {
            System.out.println("Valid age: " + age);
        }
    }
}
