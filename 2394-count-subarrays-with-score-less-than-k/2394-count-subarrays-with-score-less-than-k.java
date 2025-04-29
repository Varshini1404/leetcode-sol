class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left = 0;
        long curr = 0;
        long count = 0;

        for(int r=0;r<nums.length;r++)
        {
            curr+=nums[r];
        
        while(curr*(r-left+1)>=k)
        {
            curr-=nums[left++];
        }
        
       count+=(r-left+1);
        }
       return count;

    }
}