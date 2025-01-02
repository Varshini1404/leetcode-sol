class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int start=nums[i];
            while(i+1<n && nums[i]+1 == nums[i+1])
            {
                i++;
            }
            if(start==nums[i])
            {
                result.add(String.valueOf(start));
            }
            else
            {
                result.add(start+"->"+nums[i]);
            }

        }
        return result;
    }
}