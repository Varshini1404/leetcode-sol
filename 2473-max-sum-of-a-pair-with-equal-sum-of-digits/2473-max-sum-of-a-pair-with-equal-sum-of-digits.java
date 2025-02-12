class Solution {
    private int digit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
   public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxsum = -1;

        for (int ele : nums) {
            int dsum = digit(ele); 

            if (map.containsKey(dsum)) {
                maxsum = Math.max(maxsum, ele + map.get(dsum));

                map.put(dsum, Math.max(map.get(dsum), ele));
            } else {
                map.put(dsum, ele);
            }
        }
        return maxsum;
    }

}