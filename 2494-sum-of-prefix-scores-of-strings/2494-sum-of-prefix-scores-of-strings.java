class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    int count = 0;
}
class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
            node.count++;
        }
    }
    public int getPrefixScore(String word) {
        TrieNode node = root;
        int score = 0;
        for (char c : word.toCharArray()) {
            if (!node.children.containsKey(c)) {
                break;
            }
            node = node.children.get(c);
            score += node.count;
        }
        return score;
    }
}
class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        int[] result = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = trie.getPrefixScore(words[i]);
        }
        return result;
    }
}