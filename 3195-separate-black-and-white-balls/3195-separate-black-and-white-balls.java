class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long count =0;
        int curr=0;
        int whitePosition =0;

        while(curr<n){
            if(s.charAt(curr) == '0'){
                count += curr-whitePosition;
                whitePosition++;
            }
            curr++;
        }

        return count;
    }
}