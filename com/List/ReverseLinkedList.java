import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        List<Character> list = initializeList();
        reverseList(list);
        printList(list);
    }

    public static LinkedList<Character> initializeList() {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        return list;
    }

    public static void reverseList(List<Character> list) {
        Collections.reverse(list);
    }

    public static void printList(List<Character> list) {
        System.out.println("Reversed list: " + list);
    }
}
