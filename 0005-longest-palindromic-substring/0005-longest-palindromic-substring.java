class Solution {
    public String longestPalindrome(String s) {
        //if string length is 1 then that is a only a substring return it
        if(s.length()==1) return s;
        
        //create a result variable to store longest palindrome
        String res="";
        
        //iterate from 0 to last index for every index check for palindrome from it's index to left and right
        
        for(int i=0;i<s.length();i++){
            //we can have both case at the time we reach middle of string length,
            //for odd we have to check from that middle to left and right
            String odd=palindrome(s,i,i);
            //for even we have to check from that middle and middle +1
            String even=palindrome(s,i,i+1);
            
            //check if odd length is bigger then result length then store it in result string
            res=odd.length()>res.length()?odd:res;
            //if even return string is bigger then result then store it in result
            res=even.length()>res.length()?even:res;
        }
        
        return res;     //return the stored result which containes longest palindrome substring
    }
    
    private String palindrome(String str,int left,int right){
        //we can't go out of index for string and also both our left and right should match for increasing length of the substring
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        //create a substring and return
        return str.substring(left+1,right);
        //we took left+1 as above loop will check for the wrong state which we have not to consider now for substring
    }
}