
import java.util.Stack;
import java.util.Arrays;

public class StackToArrayExample {

    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        stack.push(4.4);
        stack.push(5.5);

        Double[] array = new Double[stack.size()];
        stack.toArray(array);

        System.out.println("Array: " + Arrays.toString(array));

        Stack<Double> newStack = new Stack<>();
        newStack.addAll(Arrays.asList(array));

        System.out.println("New stack: " + newStack);
    }
}
