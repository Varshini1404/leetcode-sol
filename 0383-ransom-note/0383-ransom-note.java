class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> hp = new HashMap<>();
        for(char ch : m.toCharArray())
        {
            hp.put(ch,hp.getOrDefault(ch,0)+1);
        }
        for(char ch : r.toCharArray())
        {
            if(!hp.containsKey(ch) || hp.get(ch)==0)
            {
                return false;
            }
            hp.put(ch, hp.get(ch) - 1);
        }
        return true;
    }
}