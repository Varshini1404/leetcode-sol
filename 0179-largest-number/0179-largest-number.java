class Solution {
    public String largestNumber(int[] nums) {
        String str[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        StringBuilder r=new StringBuilder();
        for(String s : str)
        {
            r.append(s);

        }
    
    return (r.charAt(0)=='0')?"0":r.toString();
    }
}