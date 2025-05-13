class Solution {
    public int findNumbers(int[] nums) {
       int c = 0;
       int n = nums.length;
       
       for(int i=0;i<n;i++)
       {
        int dc = 0;
        int num=nums[i];
        while(num!=0)
        {
            num/=10;
            dc++;
        }
        if(dc%2==0){
            c++;
        }
       }
       return c;
    }
}