import java.util.Stack;

public class StringStackOperations {

    private Stack<String> stack;

    public StringStackOperations() {
        stack = new Stack<>();
    }

    public void initializeStack() {
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");
    }

    public void printTopElement() {
        if (!stack.isEmpty()) {
            System.out.println("Top element (using peek): " + stack.peek());
        } else {
            System.out.println("The stack is empty.");
        }
    }

    public void searchElement(String element) {
        int position = stack.search(element);
        if (position != -1) {
            System.out.println("Position of \"" + element + "\" in the stack: " + position);
        } else {
            System.out.println("\"" + element + "\" is not in the stack.");
        }
    }

    public static void main(String[] args) {
        StringStackOperations operations = new StringStackOperations();

        operations.initializeStack();
        operations.printTopElement();
        operations.searchElement("second");
    }
}
