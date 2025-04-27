class Solution {
    public boolean isHappy(int n) {
        int sum=n;
        while(n>9||n==7)
        {
            sum=0;
            while(n>0)
            {
                sum+=((n%10)*(n%10));
                n/=10;
            }
            n=sum;
        }
        if(n!=1)
        {
            return false;
        }
        return true;
    }
}