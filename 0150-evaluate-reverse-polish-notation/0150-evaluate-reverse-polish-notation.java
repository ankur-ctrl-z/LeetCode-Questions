class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            
            if (token.length() == 1 && isOperators(token.charAt(0))) {
                int b = st.pop(); 
                int a = st.pop();
                char op = token.charAt(0);
                
                int result = 0;
                switch (op) {
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
                }
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    public static boolean isOperators(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}

