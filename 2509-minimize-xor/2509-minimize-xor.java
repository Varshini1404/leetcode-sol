class Solution {
    public int minimizeXor(int num1, int num2) {
        int c = 0;
        for(int i=0;i<32;++i)
        {
            if((num2 & (1 << i)) > 0 ) 
                c++;
        }
        int x = 0;
        for(int i=31;i>=0;--i)
        {
            if((num1 & (1 << i)) > 0 )
            {
                if(c>0)
                {
                    x = x | (1 << i);
                    c--;
                }
            }
        }
        if(c==0)
            return x;
        for(int i=0;i<32;++i)
        {
            if((x & (1<<i))==0)
            {
                x = x | (1<<i);
                c--;
            }
            if(c==0)
                break;
        }
        return x;
    }
}