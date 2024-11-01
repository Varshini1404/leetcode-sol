class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isDup = false;
        char prev = '1';
        for(char ch:s.toCharArray())
        {
            if(isDup && ch == prev){
                continue;
            }
            if(ch == prev){
                isDup = true;
            }else{
                isDup = false;
            }
            sb.append(ch);
            prev = ch;
        }
        return sb.toString();
    }
}