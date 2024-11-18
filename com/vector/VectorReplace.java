import java.util.Vector;
import java.util.Enumeration;

public class VectorReplace {
    public static void main(String[] args) {
        Vector<String> vector = initializeVector();
        printElementsWithEnumeration(vector);
        modifyVector(vector);
        printAllElements(vector);
    }

    public static Vector<String> initializeVector() {
        Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("banana");
        vector.add("cherry");
        vector.add("date");
        vector.add("fig");
        return vector;
    }

    public static void printElementsWithEnumeration(Vector<String> vector) {
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    public static void modifyVector(Vector<String> vector) {
        for (int i = 0; i < vector.size(); i++) {
            if ("cherry".equals(vector.get(i))) {
                vector.set(i, "coconut");
            }
        }
    }

    public static void printAllElements(Vector<String> vector) {
        System.out.println("Modified vector: " + vector);
    }
}
