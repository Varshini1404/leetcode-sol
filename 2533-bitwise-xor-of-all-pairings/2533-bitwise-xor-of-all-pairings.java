class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans=0;
        int n=nums1.length;
        int m=nums2.length;
            if((m&1)==1){
            for(int i=0;i<nums1.length;i++)
            {
                ans^=nums1[i];
            }
            }
            if((n&1)==1)
            {
                for(int i=0;i<nums2.length;i++)
                {
                    ans^=nums2[i];
                }
            }
            return ans;
        
    }
}