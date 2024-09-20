class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split("\\s");
        int si=arr.length;
        return arr[si-1].length();
    }
}