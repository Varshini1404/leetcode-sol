class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> v=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            s.add(nums1[i]);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(s.contains(nums2[i]))
            {
                v.add(nums2[i]);
            }
        }
        int index=0;
        int[] arr1=new int[v.size()];
        for(int i:v)
        {
            arr1[index]=i;
            index++;

        }
        return arr1;
    }
}