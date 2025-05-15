import java.util.*;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long current = (long) nums[i];

            Long lower = set.floor(current + valueDiff);
            Long upper = set.ceiling(current - valueDiff);

            if ((lower != null && lower >= current) || (upper != null && upper <= current)) {
                return true;
            }

            set.add(current);

            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}