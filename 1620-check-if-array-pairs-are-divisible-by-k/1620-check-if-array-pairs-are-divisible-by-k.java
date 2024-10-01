class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        int[] remainderCount=new int[k];

        for(int num:arr)
        {
            int remainder=((num%k)+k)%k;
            remainderCount[remainder]++;
        }

        if(remainderCount[0]%2!=0)
          return false;
        
        for(int i=2;i<k;i++)
        {
            if(i==k-i)
            {
                if(remainderCount[i]%2!=0)
                  return false;
            }
            else
            {
                if(remainderCount[i] != remainderCount[k-i])
                  return false;
            }
        }
        return true;
    }
}