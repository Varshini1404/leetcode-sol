class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
       {
        return false;
       }

       char[] sf = s.toCharArray();
       char[] tf = t.toCharArray();
       Arrays.sort(sf);
       Arrays.sort(tf);
       if(Arrays.equals(sf,tf))
       {
        return true;
       }
       return false;
    }
}