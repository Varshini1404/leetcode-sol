class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
           int n = times.length;
        List<int[]> events = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            events.add(new int[]{times[i][0], i, 1});
            events.add(new int[]{times[i][1], i, 0});
        }
        
        Collections.sort(events, (a, b) -> {
            if (a[0] == b[0]) return a[2] - b[2];
            return a[0] - b[0];
        });
        
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.add(i);
        }
        
        int[] friendChair = new int[n];
        
        for (int[] event : events) {
            int time = event[0];
            int friendIndex = event[1];
            int eventType = event[2];
            
            if (eventType == 1) {
                int chair = availableChairs.poll();
                friendChair[friendIndex] = chair;
                if (friendIndex == targetFriend) {
                    return chair;
                }
            } else {
                availableChairs.add(friendChair[friendIndex]);
            }
        }
        
        return -1;
    }
}