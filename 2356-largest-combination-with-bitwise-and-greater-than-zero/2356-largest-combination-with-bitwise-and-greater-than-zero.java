class Solution {
    public int largestCombination(int[] candidates) {
        int[] count = new int[32]; 
        for (int num : candidates) {
            int index = 0;
            
            while (num > 0) {
                count[index++] += num & 1; 
                num >>= 1; 
            }
        }

        int result = 0;
        for (int c : count) {
            result = Math.max(result, c); 
        }

        return result; 
    }
}