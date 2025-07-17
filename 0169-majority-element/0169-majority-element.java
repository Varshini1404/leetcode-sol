class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==nums[i])
                {
                    c++;
                }
            }
            if(c>nums.length/2)
            {
                return nums[i];
            }
        }
        return -1;
    }
}