class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] windowSum = new int[n - k + 1];
        int[] left = new int[n - k + 1];
        int[] right = new int[n - k + 1];
        int[] result = new int[3];
        
        
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k - 1) {
                windowSum[i - k + 1] = sum;
                sum -= nums[i - k + 1];
            }
        }
        
        
        int best = 0;
        for (int i = 0; i < windowSum.length; i++) {
            if (windowSum[i] > windowSum[best]) {
                best = i;
            }
            left[i] = best;
        }
        
      
        best = windowSum.length - 1;
        for (int i = windowSum.length - 1; i >= 0; i--) {
            if (windowSum[i] >= windowSum[best]) {
                best = i;
            }
            right[i] = best;
        }
        
        
        int maxSum = 0;
        for (int mid = k; mid < windowSum.length - k; mid++) {
            int l = left[mid - k];
            int r = right[mid + k];
            int total = windowSum[l] + windowSum[mid] + windowSum[r];
            if (total > maxSum) {
                maxSum = total;
                result[0] = l;
                result[1] = mid;
                result[2] = r;
            }
        }
        
        return result;
    }
}