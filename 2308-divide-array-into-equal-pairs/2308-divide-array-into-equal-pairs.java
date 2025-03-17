class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                return false;
            }
        }
        return true;}
}
       /* Set <Integer> map = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
        int num = nums[i];
        
        if(map.contains(num))
        {
            map.remove(num);
        }
        else{
            map.add(num);
        }
        }
        return map.size()==0;*/

    