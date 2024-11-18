import java.util.List;
import java.util.ArrayList;

public class FruitList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        
        String thirdFruit = fruits.get(2);
        System.out.println("The third fruit in the list is: " + thirdFruit);
    }
}
