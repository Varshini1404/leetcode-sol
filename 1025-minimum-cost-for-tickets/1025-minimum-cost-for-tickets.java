class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length + 1];
        int[] durations = new int[] {1, 7, 30};

        for (int i = days.length - 1; i >= 0; i--) {
            int minCost = Integer.MAX_VALUE;
            int j = i;
            for (int k = 0; k < durations.length; k++) {
                while (j < days.length && days[j] < days[i] + durations[k]) {
                    j++;
                }
                minCost = Math.min(minCost, dp[j] + costs[k]);
            }
            dp[i] = minCost;
        }

        return dp[0];
    }
}