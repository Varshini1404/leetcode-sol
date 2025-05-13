class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int c = 0;

        for(int i=0;i<n;i++)
        {
           int num = nums[i];
           int dc= 0;

           while(num!=0)
           {
            num/=10;
            dc++;
           }
           if(dc%2==0)
           {
            c++;
           }
        }
        return c;

    }
}