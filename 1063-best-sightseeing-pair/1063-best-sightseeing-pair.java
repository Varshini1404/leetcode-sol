class Solution {
    public int maxScoreSightseeingPair(int[] arr) {
        int n = arr.length;
        int max = 0;
        int res = 0;

        for(int i=0;i<n;i++){
            res = Math.max(res, max+arr[i]-i);
            max = Math.max(max, arr[i]+i);
        }
        return res;
    }
}