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
            prev=curr;//0 and 1 not equal so reseting 
            curr=1;
           } 
           if(prev>=curr)//in first iteration  prev =2 and current reset as 1,
           {
            c++;//so it get inside 
           }

        }
        return c;
    }

}