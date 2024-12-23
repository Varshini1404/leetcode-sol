class Solution {
    public String minWindow(String s, String t) {
        var stringLength = s.length();
        var substringLength = t.length();

        if (substringLength > stringLength) {
            return "";
        }

        if (s.contains(t)) {
            return t;
        }

        var minimumWindowSubstringLength = Integer.MAX_VALUE;
        var minimumWindowSubstring = "";

        var window = new Window(s, t);

        while (window.canExpandWindowToTheRight()) {
            window.expandWindowToTheRight();

            while (window.isValid()) {
                var currentWindowLength = window.getLength();

                if (currentWindowLength < minimumWindowSubstringLength) {
                    minimumWindowSubstringLength = currentWindowLength;
                    minimumWindowSubstring = window.getCurrentWindowSubstring();
                }

                window.shrinkWindowFromTheLeft();
            }
        }

        return minimumWindowSubstring;
    }

    private static class Window {
        private final String stringToOperateOn;
        private final Map<Character, Integer> substringCharacterToCountMap;
        private final Map<Character, Integer> currentStringCharacterToCountMap;
        private int startIndex;
        private int endIndex;

        public Window(String stringToOperateOn, String substringToOperateOn) {
            this.stringToOperateOn = stringToOperateOn;
            this.substringCharacterToCountMap = createCharacterToCountMap(substringToOperateOn);

            startIndex = 0;
            endIndex = 0;

            this.currentStringCharacterToCountMap = new HashMap<>();
            currentStringCharacterToCountMap.put(stringToOperateOn.charAt(endIndex), 1);
        }

        private static Map<Character, Integer> createCharacterToCountMap(String string) {
            var characterToCountMap = new HashMap<Character, Integer>();

            for (var i = 0; i < string.length(); i++) {
                var currentCharacter = string.charAt(i);

                characterToCountMap.put(currentCharacter, characterToCountMap.getOrDefault(currentCharacter, 0) + 1);
            }

            return characterToCountMap;
        }

        public boolean isValid() {
            for (var entry : substringCharacterToCountMap.entrySet()) {
                var substringCharacter = entry.getKey();
                var substringCharacterCount = entry.getValue();

                if (currentStringCharacterToCountMap.getOrDefault(substringCharacter, 0) < substringCharacterCount) {
                    return false;
                }
            }

            return true;
        }

        public boolean canExpandWindowToTheRight() {
            return endIndex < stringToOperateOn.length() - 1;
        }

        public void expandWindowToTheRight() {
            endIndex++;

            var characterAtEndIndex = stringToOperateOn.charAt(endIndex);
            currentStringCharacterToCountMap.put(characterAtEndIndex, currentStringCharacterToCountMap.getOrDefault(characterAtEndIndex, 0) + 1);
        }

        public void shrinkWindowFromTheLeft() {
            var characterAtStartIndex = stringToOperateOn.charAt(startIndex);
            currentStringCharacterToCountMap.put(characterAtStartIndex, currentStringCharacterToCountMap.getOrDefault(characterAtStartIndex, 0) - 1);

            startIndex++;
        }

        public int getLength() {
            return endIndex - startIndex + 1;
        }

        public String getCurrentWindowSubstring() {
            return stringToOperateOn.substring(startIndex, endIndex + 1);
        }
    }
}