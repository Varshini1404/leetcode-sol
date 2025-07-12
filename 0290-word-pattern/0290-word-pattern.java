class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        HashMap<Character,String> hp = new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char pc = pattern.charAt(i);
            String w = words[i];
        
        if(hp.containsKey(pc))
        {
            if(!hp.get(pc).equals(w))
            {
                return false;
            }
        }
        
        else{
            if(hp.containsValue(w))
            {
                return false;
            }
        
        }
        hp.put(pc,w);
        }
        return true;
    }
}