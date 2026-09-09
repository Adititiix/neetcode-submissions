class Solution {

    public int Operate(int a, int b, String token) {

        if(token.equals("+")) {
            return a + b;
        }
        else if(token.equals("-")) {
            return b - a;
        }
        else if(token.equals("*")) {
            return a * b;
        }
        else {
            return b / a;
        }
    }

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {

            if(token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/")) {

                int a = stack.pop();
                int b = stack.pop();

                int result = Operate(a, b, token);

                stack.push(result);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}