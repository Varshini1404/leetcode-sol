
class Solution {
    public int evalRPN(String[] token) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < token.length; i++) {
            if (!token[i].equals("+") && !token[i].equals("-") && !token[i].equals("*") && !token[i].equals("/")) {
                st.push(token[i]);
            } else {
                int ans = 0;
                int v1 = Integer.parseInt(st.pop());
                int v2 = Integer.parseInt(st.pop());

                if (token[i].equals("+")) {
                    ans = v2 + v1;
                } else if (token[i].equals("-")) {
                    ans = v2 - v1;
                } else if (token[i].equals("*")) {
                    ans = v2 * v1;
                } else if (token[i].equals("/")) {
                    ans = v2 / v1;
                }

                st.push(Integer.toString(ans)); 
            }
        }
        return Integer.parseInt(st.peek());
    }
}
