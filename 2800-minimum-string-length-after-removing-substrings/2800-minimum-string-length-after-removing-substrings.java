import java.util.Stack;
import java.util.Scanner;

class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (!st.isEmpty()) {
                char top = st.peek();
                
                if ((top == 'A' && curr == 'B') || (top == 'C' && curr == 'D')) {
                    st.pop();
                } else {
                    st.push(curr);
                }
            } else {
                st.push(curr);
            }
        }
        
        return st.size();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution solution = new Solution();
        
        int result = solution.minLength(s);
        System.out.println(result);
    }
}
