class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int dp[][] = new int[m][n];
        baseTabulation(matrix, m, n, dp);
        tabulation(matrix, m, n, dp);
        return countDP(dp, m, n);
    }

    public void baseTabulation(int matrix[][], int m, int n, int dp[][]) {
        for(int i = 0; i < m; i++)
            dp[i][0] = matrix[i][0] == 1 ? 1 : 0;
        for(int j = 0; j < n; j++)
            dp[0][j] = matrix[0][j] == 1 ? 1 : 0;
    }

    public void tabulation(int matrix[][], int m, int n, int dp[][]) {
        for(int i = 1; i < m; i++)
            for(int j = 1; j < n; j++)
                dp[i][j] = matrix[i][j] == 0 ? 0 :
                Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]))+1;
    }

    public int countDP(int dp[][], int m, int n) {
        int count = 0;
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                count += dp[i][j];
        return count;
    }
}