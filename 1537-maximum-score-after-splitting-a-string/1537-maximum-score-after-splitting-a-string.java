class Solution {
    public int maxScore(String s) {
        int n= s.length();
        int onecount=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                onecount++;
            }
        }
            int zerocount=0;
            int max=0;
            for(int i=0;i<n-1;i++)
            {
                if(s.charAt(i)=='1')
                {
                    onecount--;
                }
                else
                {
                    zerocount++;
                }
                max=Math.max(max,zerocount+onecount);
            }
            return max;
    }
}