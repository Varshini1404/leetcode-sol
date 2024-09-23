import java.util.Random;
class Solution {
    private int nums[];

    public Solution(int[] nums) {
        this.nums=nums;
    }
    
    public int pick(int target) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                arr.add(i);
            }
           
            

        }
        Random fun = new Random();
        int index=fun.nextInt(arr.size());
        return arr.get(index);
    }
}

