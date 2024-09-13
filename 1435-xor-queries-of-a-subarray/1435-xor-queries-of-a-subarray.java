class Solution {
    public int[] xorQueries(int[] arr, int[][] a) {
        int[] dp = new int[arr.length];
        int[] res = new int[a.length];
        dp[0] = arr[0];
        for(int i=1; i<arr.length; i++) dp[i] = arr[i]^dp[i-1];
        for(int i=0; i<a.length; i++){
            if(a[i][0]==a[i][1]) res[i] = arr[a[i][1]];
            else if(a[i][0]==0) res[i] = dp[a[i][1]];
            else res[i] = dp[a[i][1]]^dp[a[i][0]-1];
        }
        return res;
    }
}