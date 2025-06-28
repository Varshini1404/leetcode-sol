import java.util.Stack;
class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
        char c = str.charAt(i);
        if(c=='{'||c=='('||c=='[')
        {
            s.push(c);
        }
        else{
            if(s.isEmpty())
            return false;;
        
        char top = s.pop();
        if((c==']'&& top!='[')||(c=='}'&&top!='{')||(c==')'&&top!='('))
        {

            return false;
        }
        }
        }
        return s.isEmpty();
    }
}