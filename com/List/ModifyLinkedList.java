import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;

public class ModifyLinkedList {
    public static void main(String[] args) {
        List<String> list = initializeList();
        modifyList(list);
        printList(list);
    }

    public static LinkedList<String> initializeList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        return list;
    }

    public static void modifyList(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if ("three".equals(current)) {
                iterator.set("THREE");
            }
        }
    }

    public static void printList(List<String> list) {
        System.out.println("Modified list: " + list);
    }
}
