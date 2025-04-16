class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while(l<=r)
        {
            int h = Math.min(height[l],height[r]);
            max = Math.max(max,(r-l)*h);

            while(l<=r && height[l]<=h)
            {
                l++;
            }
            while(l<=r && height[r]<=h)
            {
                r--;
            }
        }
        return max;


    }
}