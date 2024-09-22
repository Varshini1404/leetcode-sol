class Solution {

    //function to count the steps between curr and curr+1
    private static int countSteps(long curr, long n) {
        int steps = 0;
        long first = curr;
        long last = curr;

        while (first <= n) {
            steps += Math.min(n+1,last+1) - first;
            first *= 10;
            last = last * 10 + 9;
        }
        return steps;
    }
 
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--; // we are starting from the first no

        while (k > 0) {
            int steps = countSteps(curr, n);
            if(steps <= k) {
                //skip the prefix and move next one
                k -= steps;
                curr++;
            } else {
                curr *= 10;
                k--;
            }
        }
        return curr;
    }
}