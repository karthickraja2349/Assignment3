import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
    private BufferedReader reader;

    public InputHandler() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getUserInput() {
        try {
            System.out.print("Enter a phrase to convert to an acronym: ");
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("An error occurred while reading input. Please try again.");
            return "";
        }
    }
}
