class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res =new ArrayList<>();
        Set<Integer> nums2 = new HashSet<>();
        int n = nums.length;

        for(int i:nums)
        {
            nums2.add(i);
        }
        for(int i=1;i<=n;i++)
        {
            if(!nums2.contains(i))
            {
                res.add(i);
            }
        }
        return res;
    }
}