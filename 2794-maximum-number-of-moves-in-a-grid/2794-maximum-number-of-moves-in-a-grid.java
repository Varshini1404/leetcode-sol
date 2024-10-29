class Solution {
    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int [n][m];

        for (int i=m-2; i >= 0; i--) {
            for (int j =0; j<n; j++) {
                int k = grid[j][i];
                if (j - 1 >= 0 && grid[j-1][i+1] > k) {
                    dp[j][i] = Math.max(dp[j][i], 1 + dp[j-1][i+1]);
                }
                if (grid[j][i+1] > k) {
                    dp[j][i] = Math.max(dp[j][i], 1 + dp[j][i + 1]);
                }
                if (j + 1 < n && grid[j+1][i+1] > k) {
                    dp[j][i] = Math.max(dp[j][i], 1 + dp[j+1][i+1]);
                }
            }
        }
        int count = 0;
        for (int[] i : dp) {
            count = Math.max(count, i[0]);
        }
        return count;
    }
}