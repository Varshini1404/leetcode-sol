class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]- b[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int[] interval: intervals){
            if(!minHeap.isEmpty() && minHeap.peek() < interval[0]){
                minHeap.poll();
            }
            minHeap.add(interval[1]);
        }
        return minHeap.size();

    }
}