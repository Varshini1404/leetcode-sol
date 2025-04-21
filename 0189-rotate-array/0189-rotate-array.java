class Solution {
    public void rotate(int[] nums, int k) {
     int n = nums.length;
     k=k%n;

     int[] t = new int[n];
     for(int i=0;i<n;i++)
    {
        t[(k+i)%n]=nums[i];
    }
    for(int i=0;i<n;i++)
    {
    nums[i]=t[i];}
    }
}