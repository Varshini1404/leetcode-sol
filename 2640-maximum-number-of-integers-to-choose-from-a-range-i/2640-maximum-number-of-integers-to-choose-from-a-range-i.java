class Solution {
   public static int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }

        int countNumbers = 0; 
        int sum = 0; 

        for (int i = 1; i <= n; i++) {
            if (bannedSet.contains(i)) {
                continue;
            }
            if (sum + i > maxSum) {
                break;
            }
            sum += i;
            countNumbers++;
        }

        return countNumbers; 
    }
}