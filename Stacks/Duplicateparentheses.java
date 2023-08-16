import java.util.*;

public class Duplicateparentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                boolean foundDuplicate = false;

                // Pop and count until an opening parenthesis '(' is encountered
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    foundDuplicate = true;
                }

                // If no opening parenthesis was encountered, it's a duplicate
                if (!foundDuplicate) {
                    return true;
                }

                // Remove the opening parenthesis '(' from the stack
                s.pop();
            } else {
                // Push other characters onto the stack
                s.push(ch);
            }
        }

        // If the stack is not empty at the end, there are unmatched opening parentheses
        return !s.isEmpty();
    }

    public static void main(String args[]) {
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
