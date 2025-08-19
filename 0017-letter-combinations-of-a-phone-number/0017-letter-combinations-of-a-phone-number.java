import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> c1 = new ArrayList<>();
        c1.add("");

        for (int i = 0; i < digits.length(); i++) {
            char d = digits.charAt(i);    
            String l = map.get(d);         
            List<String> c2 = new ArrayList<>();

            for (int k = 0; k < c1.size(); k++) {
                String com = c1.get(k);
                for (int j = 0; j < l.length(); j++) {
                    char le = l.charAt(j);
                    c2.add(com + le);
                }
            }

            c1 = c2; 
        }

        return c1;
    }
}
