class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr=new int[3];
        int l=0;
        int res=0;

        for(int r=0;r<s.length();r++)
        {
            arr[s.charAt(r)-'a']++;

            while(arr[0]>0 && arr[1]>0 && arr[2]>0)
            {
                res+=s.length()-r;
                arr[s.charAt(l)-'a']--;
                l++;
            }
        }
        return res;
    }
}