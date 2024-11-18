import java.util.Stack;

public class ParenthesesChecker {

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ParenthesesChecker checker = new ParenthesesChecker();
        
        String input1 = "(())";
        String input2 = "(()";
        String input3 = "((())())";
        
        System.out.println("Input: " + input1 + " is balanced: " + checker.isBalanced(input1));
        System.out.println("Input: " + input2 + " is balanced: " + checker.isBalanced(input2));
        System.out.println("Input: " + input3 + " is balanced: " + checker.isBalanced(input3));
    }
}
