class Solution {
    public String removeOccurrences(String s, String part) {
        if(s.contains(part)==false)
        return s;
        String str = new String();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            str=str+ch[i];
            if(str.contains(part))
            {
                str=str.substring(0,str.length()-part.length());
            }
        }
        return str;
    }
}