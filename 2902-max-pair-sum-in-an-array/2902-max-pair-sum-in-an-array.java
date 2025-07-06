class Solution {
    public int maxSum(int[] nums) {
        int[] maxSeen = new int[10]; 
        int result = -1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int maxDigit = 0;

            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                temp = temp / 10;
            }

            
            if (maxSeen[maxDigit] > 0) {
                result = Math.max(result, maxSeen[maxDigit] + num);
                maxSeen[maxDigit] = Math.max(maxSeen[maxDigit], num);
            } else {
                maxSeen[maxDigit] = num;
            }
        }

        return result;
    }
}
