class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> hp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
        if(hp.containsKey(sc))
        {
            if(hp.get(sc)!=tc)
            {
                return false;
            }
        }
            else{
                
                if(hp.containsValue(tc))
                {
                    return false;
                }
           hp.put(sc,tc);
            
        }
     }
        return true;
           
    }
}