class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0;
        int curr=1;
        int c=0;
        for(int i=1;i<s.length();i++)
        {
           if(s.charAt(i-1)==s.charAt(i))
           {
            curr++;
           }
           else{
            prev=curr;
            curr=1;
           } 
           if(prev>=curr)
           {
            c++;
           }

        }
        return c;
    }
}