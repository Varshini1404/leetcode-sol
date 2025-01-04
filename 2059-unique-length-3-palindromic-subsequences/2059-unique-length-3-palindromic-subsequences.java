class Solution {
    public int countPalindromicSubsequence(String s) {
        int c=0;
        for(char i='a';i<='z';++i)
        {
            int l=s.indexOf(i);
            int r=s.lastIndexOf(i);
        
        Set<Character> ss=new HashSet<>(); 
        for(int a=l+1;a<r;++a)
        {
            ss.add(s.charAt(a));
        }
        c+=ss.size();
        }

    return c;
    }
}