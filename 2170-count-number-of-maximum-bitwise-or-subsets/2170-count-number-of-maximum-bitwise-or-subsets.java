class Solution {
    int maxOR = 0;
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        // Step 1: Calculate the maximum possible OR value
        for (int num : nums) {
            maxOR |= num;  // This gets the maximum possible OR of the entire array
        }

        // Step 2: Use backtracking to count subsets with maximum OR
        backtrack(nums, 0, 0);
        
        return count;
    }

    // Backtracking function
    private void backtrack(int[] nums, int index, int currentOR) {
        if (index == nums.length) {
            // If we've reached the end of the array, check if the OR equals maxOR
            if (currentOR == maxOR) {
                count++;  // Increment the count if current OR is the maximum
            }
            return;
        }

        // Include the current number in the subset
        backtrack(nums, index + 1, currentOR | nums[index]);

        // Exclude the current number from the subset
        backtrack(nums, index + 1, currentOR);
    }
}