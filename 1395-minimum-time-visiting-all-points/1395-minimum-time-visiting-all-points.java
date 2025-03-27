class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sec=0;
        int n=points.length-1;
        for(int i=0;i<n;i++)
        {
            int x_diff = Math.abs(points[i][0]-points[i+1][0]);
            int y_diff = Math.abs(points[i][1]-points[i+1][1]);

            if(x_diff < y_diff)
            {
                sec+=x_diff;
                sec+=y_diff-x_diff;
            }
            else{
                sec+=y_diff;
                sec+=x_diff-y_diff;
            }
        }
        return sec;
    }
}