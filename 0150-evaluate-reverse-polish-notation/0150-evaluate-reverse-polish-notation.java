class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        
        for(int i = 0; i < tokens.length; i++){
           st.push(tokens[i]);
        }

        Stack<Integer> temp = new Stack<>();

        for (String token : st) {
            if (token.length() == 1 && isOperators(token.charAt(0))) {
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
                temp.push(Integer.parseInt(token));
            }
        }
        
        return temp.pop();
    }

    public static boolean isOperators(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}


