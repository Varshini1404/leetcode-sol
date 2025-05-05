class Solution {
    public int heightChecker(int[] heights) {
        int expected[] = Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        int c = 0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=expected[i])
            {
                c++;
            }
        }
        return c;
    }
}