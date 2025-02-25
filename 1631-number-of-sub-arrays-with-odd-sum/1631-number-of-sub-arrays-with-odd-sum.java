class Solution {
    private static final int MOD = 1000000007;
    public int numOfSubarrays(int[] arr) {
        int prefix_sum = 0;
        int even = 1;
        int odd = 0;
        int result = 0;

        for(int num : arr){
            prefix_sum += num;
            if(prefix_sum % 2 ==0){
                result = (result+odd) % MOD;
                even ++;
            }else {
                result = (result + even) % MOD;
                odd++; 
        }
        
        }
        return result;
    }

}