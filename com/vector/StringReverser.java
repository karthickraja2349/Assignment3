import java.util.Stack;

public class StringReverser {

    public String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        String input = "hello";
        String output = reverser.reverseString(input);

        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + output);
    }
}
