import java.util.Vector;

public class VectorSample {
    public static void main(String[] args) {
        Vector<Integer> vector = initializeVector();
        printElementAtIndex(vector, 2);
        printAllElements(vector);
    }

    public static Vector<Integer> initializeVector() {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        return vector;
    }

    public static void printElementAtIndex(Vector<Integer> vector, int index) {
        if (index >= 0 && index < vector.size()) {
            System.out.println("Element at index " + index + ": " + vector.get(index));
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public static void printAllElements(Vector<Integer> vector) {
        System.out.println("All elements in the vector: " + vector);
    }
}
