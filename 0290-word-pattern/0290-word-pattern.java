class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        
        if(pattern.length()!=words.length)
        {
            return false;
        }
        HashMap<Character,String> hp = new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char pc = pattern.charAt(i);
            String sc = words[i];
        
        if(hp.containsKey(pc))
        {
            if(!hp.get(pc).equals(sc))
            {
                return false;
            }
        }
        else{
            if(hp.containsValue(sc))
            {
                return false;
            }
            hp.put(pc,sc);
        }
        }
        return true;

    }
}