import java.util.LinkedList;
import java.util.List;
public class LinkedListAddition {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        addElements(list);
        printFirstAndLastElements(list);
    }

    public static void addElements(LinkedList<Integer> list) {
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
    }

    public static void printFirstAndLastElements(LinkedList<Integer> list) {
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
    }
}
