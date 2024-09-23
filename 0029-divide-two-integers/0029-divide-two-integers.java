class Solution {
    public int divide(int dividend, int divisor) {
       if(divisor==0 || (dividend == Integer.MIN_VALUE && divisor == -1))
       {
        return Integer.MAX_VALUE;
       }
       int res=dividend/divisor;
       return res;
    }
}


