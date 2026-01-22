import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        
        // Corrected loop to push all tokens onto the stack first
        for(int i = 0; i < tokens.length; i++){
           st.push(tokens[i]);
        }

        // Using a temporary stack to process in the correct RPN order
        Stack<Integer> temp = new Stack<>();

        // We iterate through the original stack exactly once
        for (String token : st) {
            if (token.length() == 1 && isOperators(token.charAt(0))) {
                // When we hit an operator, we pop two from our number stack
                int b = temp.pop(); 
                int a = temp.pop();
                char ch = token.charAt(0);
                int result = 0;

                switch (ch) {
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
                }
                temp.push(result);
            } else {
                // If it's a number, convert and store in the number stack
                temp.push(Integer.parseInt(token));
            }
        }
        
        return temp.pop();
    }

    public static boolean isOperators(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}


