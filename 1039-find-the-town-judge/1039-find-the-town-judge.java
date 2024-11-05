class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] out = new int[n + 1];
        int[] in= new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            out[trust[i][0]]++;
            in[trust[i][1]]++;
        }
 
        int ans = -1;

        for (int i = 1; i <= n; i++) {
            if (out[i] == 0 && in[i] == n - 1)//indegree=n-1 and outdegree =0
                ans = i;
        }

        return ans;
    }
}