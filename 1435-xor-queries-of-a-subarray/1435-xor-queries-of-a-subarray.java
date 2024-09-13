class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int res[]=new int[queries.length];
        int j=0,r=0;
        for(int i=0;i<queries.length;i++)
        {
            int st=queries[i][0];
            int end=queries[i][1];
            r=0;
            for(int k=st;k<=end;k++)
            {
                r=r^arr[k];
            }
            res[j++]=r;


        }
        return res;

    }
}