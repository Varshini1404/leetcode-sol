class Solution {
    
    int total = 0;
    public int findTargetSumWays(int[] nums, int target) {
        

        for(int a : nums){
            total += a;
        }
        int[][] dp = new int[nums.length][2 * total + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helperMem(nums, 0, 0, target, dp);

    }

    public int helperMem(int[] nums, int i, int sum, int target, int[][] dp){
        if(i == nums.length){
            if(sum == target) return 1;
            else return 0;
        }else{
            if(dp[i][sum + total] != -1) return dp[i][sum + total];
            int pos = helperMem(nums, i + 1, sum + nums[i], target, dp);
            int neg = helperMem(nums, i + 1, sum - nums[i], target, dp);
            return dp[i][sum + total] = pos + neg;
        }
    }
}