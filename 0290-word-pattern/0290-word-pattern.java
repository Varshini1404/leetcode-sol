class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] w = s.split(" ");
if (pattern.length() != w.length) {
    return false;
}
HashMap<Character, String> hp = new HashMap<>();

for (int i = 0; i < pattern.length(); i++) {
    char ch = pattern.charAt(i);
    String word = w[i];

    if (hp.containsKey(ch)) {
        if (!hp.get(ch).equals(word)) {
            return false;
        }
    } else {
        if (hp.containsValue(word)) {
            return false;
        }
        hp.put(ch, word);
    }
}
return true;

    }
}