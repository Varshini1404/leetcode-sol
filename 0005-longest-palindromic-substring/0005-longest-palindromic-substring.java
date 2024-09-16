class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        
        String res="";
        
       
        
        for(int i=0;i<s.length();i++){
            
            String odd=palindrome(s,i,i);
            String even=palindrome(s,i,i+1);
            
            res=odd.length()>res.length()?odd:res;
            res=even.length()>res.length()?even:res;
        }
        
        return res;     
    }
    
    private String palindrome(String str,int left,int right){
        
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left+1,right);
       
    }
}