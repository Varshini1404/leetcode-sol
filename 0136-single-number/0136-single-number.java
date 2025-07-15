class Solution {
    public int singleNumber(int[] nums) {
       
        for(int i=0;i<nums.length;i++)
        {
             boolean f = false;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j && nums[i]==nums[j])
                {
                    f=true;
                    break;
                }
            }
            if(!f)
            {
                return nums[i];
            }
        }
         return -1;
    }
}