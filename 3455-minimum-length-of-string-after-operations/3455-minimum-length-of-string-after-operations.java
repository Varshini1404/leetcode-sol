class Solution {
    public int minimumLength(String s) {
        int[] map = new int[26];
        int count = 0;
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(map[i] > 0){
                if(map[i]%2 == 0) count += 2;
                else count += 1;
            }
        }
        return count;
    }
}