import java.util.Vector;
import java.util.Random;

public class VectorOperations {

    private Vector<Double> vector;

    public VectorOperations() {
        vector = new Vector<>();
    }

    public void addRandomDoubles(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            vector.add(random.nextDouble() * 20);
        }
    }

    public boolean containsValue(double value) {
        return vector.contains(value);
    }

    public void printSize() {
        System.out.println("Vector size: " + vector.size());
    }

    public void addValue(double value) {
        vector.add(value);
    }

    public static void main(String[] args) {
        VectorOperations operations = new VectorOperations();
        
        operations.addRandomDoubles(5);
        
        operations.printSize();
        
        System.out.println("Does the vector contain 10.5? " + operations.containsValue(10.5));
        
        operations.addValue(10.5);
        
        operations.printSize();
    }
}
