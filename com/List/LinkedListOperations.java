import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {
    public static void main(String[] args) {
        List<Integer> list = initializeList();
        modifyList(list);
        printList(list);
    }

    public static LinkedList<Integer> initializeList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        return list;
    }

    public static void modifyList(List<Integer> list) {
        if (list.size() > 2) {
            list.remove(2); 
        }
        if (!list.isEmpty()) {
            list.removeLast(); 
        }
    }

    public static void printList(List<Integer> list) {
        System.out.println("Resulting list: " + list);
    }
}
