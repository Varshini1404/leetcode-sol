class Solution {
    public String compressedString(String word) {
        StringBuffer comp = new StringBuffer();
        while (!word.isEmpty()) {
            char currentChar = word.charAt(0);
            int count = 1; 
            int i=1;
            while (i < word.length() && word.charAt(i) == currentChar && count < 9) {
                count++;
                i++;
            }
            comp.append(count).append(currentChar);
            word = word.substring(i);
        }
        
        return comp.toString();
    }
}