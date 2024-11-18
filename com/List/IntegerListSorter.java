import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class IntegerListSorter {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            intList.add(random.nextInt(100) + 1);
        }

        System.out.println("Original list: " + intList);

        Collections.sort(intList);

        System.out.println("Sorted list: " + intList);
    }
}
