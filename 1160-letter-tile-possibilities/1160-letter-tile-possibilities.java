class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        generate(set, tiles, "", used);
        return set.size();
    }

    private void generate(Set<String> set, String tiles, String str, boolean[] used) {
        if (!str.isEmpty()) {
            set.add(str);
        }
        
        for (int i = 0; i < tiles.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                generate(set, tiles, str + tiles.charAt(i), used);
                used[i] = false;
            }
        }
    }
}