import java.util.Vector;
import java.util.Enumeration;

public class VectorModify {
    
    private Vector<Character> vector;

    public VectorModify() {
        vector = createVector();
    }

    public Vector<Character> createVector() {
        Vector<Character> vector = new Vector<>();
        vector.add('A');
        vector.add('B');
        vector.add('C');
        vector.add('D');
        vector.add('E');
        return vector;
    }

    public void insertCharacter(int index, char character) {
        vector.add(index, character);
    }

    public void removeCharacterAtIndex(int index) {
        vector.remove(index);
    }

    public void printVector() {
        Enumeration<Character> enumeration = vector.elements();
        System.out.print("Resulting vector: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VectorModify example = new VectorModify();
        example.insertCharacter(2, 'X');
        example.removeCharacterAtIndex(0);
        example.printVector();
    }
}
