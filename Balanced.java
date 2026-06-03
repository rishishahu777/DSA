import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char ch : s.toCharArray()) {
            // 1. If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // 2. If it's a closing bracket, verify correctness
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty, there is no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                // Check if the closing bracket matches the popped opening bracket
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        
        // 3. If stack is empty, all brackets matched perfectly
        return stack.isEmpty();
    }
}
