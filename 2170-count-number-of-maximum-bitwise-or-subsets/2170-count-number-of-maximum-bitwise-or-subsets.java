class Solution {
    int maxOR = 0;
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {
       
        for (int num : nums) {
            maxOR |= num;  
        }

        backtrack(nums, 0, 0);
        
        return count;
    }

    private void backtrack(int[] nums, int index, int currentOR) {
        if (index == nums.length) {
            if (currentOR == maxOR) {
                count++;  
            }
            return;
        }

        backtrack(nums, index + 1, currentOR | nums[index]);

        backtrack(nums, index + 1, currentOR);
    }
}