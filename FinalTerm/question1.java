package FinalTerm;
import java.util.Stack;

public class question1 {
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                sk.push(')');
            } else if (ch == '{') {
                sk.push('}');
            } else if (ch == '[') {
                sk.push(']');
            } else if (!sk.isEmpty() && ch == sk.peek()) {
                sk.pop();
            } else {
                return false;
            }
        }
        return sk.isEmpty();
    }
}
