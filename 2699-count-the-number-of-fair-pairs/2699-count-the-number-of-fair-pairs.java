class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return small(nums, upper) - small(nums, lower - 1);
    }
    
    public long small(int[] nums, int val) {
        int l = 0;
        int u = nums.length - 1;
        long res = 0;
        while (l < u) {
            int sum = nums[l] + nums[u];
            if (sum <= val) {
                res += u - l;  
                l++;
            } else {
                u--;
            }
        }
        return res;
    }
}