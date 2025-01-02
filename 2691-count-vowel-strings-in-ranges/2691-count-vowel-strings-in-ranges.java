class Solution {
    public int[] vowelStrings(String[] s, int[][] queries) {
        int n = s.length;
        int[] prefix = new int[n + 1];

        for(int i = 0; i < n; i++) {
            if(startandend(s[i])) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }

        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int st = queries[i][0];
            int en = queries[i][1];
            ans[i] = prefix[en + 1] - prefix[st];
        }
        return ans;
    }

    private boolean startandend(String s) {
        char start = s.charAt(0);
        char end = s.charAt(s.length() - 1);
        return vowel(start) && vowel(end);
    }
    private boolean vowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
