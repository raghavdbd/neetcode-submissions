

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> s1 = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            // Check if it's a number and not an operator
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && 
                !tokens[i].equals("*") && !tokens[i].equals("/")) {
                s1.push(Integer.parseInt(tokens[i]));
            } else {
                // Pop the last two operands
                int b = s1.pop();
                int a = s1.pop();
                
                // Apply the correct operation based on the token
                switch (tokens[i]) {
                    case "+":
                        s1.push(a + b);
                        break;
                    case "-":
                        s1.push(a - b);
                        break;
                    case "*":
                        s1.push(a * b);
                        break;
                    case "/":
                        s1.push(a / b);
                        break;
                }
            }
        }
        // The last item in the stack will be the result
        return s1.pop();
    }
}
