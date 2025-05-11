package Stack;
import java.util.*;

public class Simplify_it {
    public static String simplify(String str){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push slash if stack is empty or top is not '/'
            if (ch == '/') {
                if (s.isEmpty() || s.peek() != '/') {
                    s.push(ch);
                }
            }
            // If current char is dot, check for '.' or '..'
            else if (ch == '.') {
                int dotCount = 1;
                while (i + 1 < str.length() && str.charAt(i + 1) == '.') {
                    dotCount++;
                    i++;
                }

                if (dotCount == 2) {
                    // Handle ".."
                    if (!s.isEmpty()) {
                        // Remove current dir
                        s.pop(); // Remove the slash
                        while (!s.isEmpty() && s.peek() != '/') {
                            s.pop();
                        }
                    }
                }
                // If it's a single dot (.), just skip
            }
            // Normal character (a-z)
            else {
                s.push(ch);
            }
        }

        // Remove trailing slash if stack size > 1
        if (s.size() > 1 && s.peek() == '/') {
            s.pop();
        }

        // Convert stack to string
        StringBuilder result = new StringBuilder();
        for (char ch : s) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args){
        String str = "/../";
        System.out.println(simplify(str));  // Output: /a/b
    }
}
