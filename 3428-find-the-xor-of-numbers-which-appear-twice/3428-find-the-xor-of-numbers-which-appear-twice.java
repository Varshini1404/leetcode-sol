class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] count = new int[101];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        int res = 0;
        for(int i=0;i<=100;i++)
        {
            if(count[i]==2)
            {
                res^=i;
            }
        }
        return res;
    }
}