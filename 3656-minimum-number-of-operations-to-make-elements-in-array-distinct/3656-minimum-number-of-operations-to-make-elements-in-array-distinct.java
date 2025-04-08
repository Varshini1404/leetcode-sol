class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        boolean[] b = new boolean[101];
        for(int i=n-1;i>=0;i--)
        {
            if(b[nums[i]])
            {
                return (i+3)/3;
            }
            b[nums[i]]=true;
        }
        return 0;

    }
}