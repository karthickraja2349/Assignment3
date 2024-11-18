import java.util.Stack;

public class IntegerStackOperations {

    private Stack<Integer> stack;

    public IntegerStackOperations() {
        stack = new Stack<>();
    }

    public void pushElements(int... elements) {
        for (int element : elements) {
            stack.push(element);
        }
    }

    public void popTopElement() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public void printStack() {
        System.out.println("Remaining elements in the stack: " + stack);
    }

    public static void main(String[] args) {
        IntegerStackOperations operations = new IntegerStackOperations();

        operations.pushElements(10, 20, 30, 40, 50);
        operations.popTopElement();
        operations.printStack();
    }
}
