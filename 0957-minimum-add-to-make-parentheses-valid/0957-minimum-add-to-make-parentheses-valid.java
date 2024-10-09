class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<Character>();
        int res=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    res++;
                }
                else{
                    st.pop();
                } 
            }
        }
            return res+st.size();
    }
}