class Solution {
    public String remove(String s) {
        StringBuilder sb = new StringBuilder();  

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  

            if (c != '#') {  
                sb.append(c);  
            } else if (sb.length() > 0) {  
                sb.deleteCharAt(sb.length() - 1);  
            }
        }
        return sb.toString();  
    }

    
    public boolean backspaceCompare(String s, String t) {
        s = remove(s);  
        t = remove(t);  
        return s.equals(t);  
        }
}
