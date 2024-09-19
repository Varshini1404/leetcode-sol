class Solution {
    public int trap(int[] arr) {
        if (arr.length == 0) return 0;
        
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        // Fill the leftMax array
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        
        // Fill the rightMax array
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        
        // Calculate the trapped water
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        
        return ans;
    }
}
