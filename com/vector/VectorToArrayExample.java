import java.util.Vector;
import java.util.Arrays;

public class VectorToArrayExample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList("red", "green", "blue", "yellow"));
        
        String[] array = new String[vector.size()];
        vector.toArray(array);
        
        System.out.println("Array: " + Arrays.toString(array));
        
        Vector<String> newVector = new Vector<>(Arrays.asList(array));
        
        System.out.println("Vector: " + newVector);
    }
}
