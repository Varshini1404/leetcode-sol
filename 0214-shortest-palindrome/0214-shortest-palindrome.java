class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }
        
        String combined = s + "#" + new StringBuilder(s).reverse().toString();
        
        int[] lps = computeLPS(combined);
        
        int len = lps[2 * n];
        
        String shortestPalindrome = new StringBuilder(s.substring(len)).reverse().toString() + s;
        
        return shortestPalindrome;
    }
    
    private int[] computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0; 
        
        for (int i = 1; i < n; ) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps;
    }
}