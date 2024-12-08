class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        PriorityQueue<int[]>memo = new PriorityQueue<>((a,b)->a[0]-b[0]);
        int currMax = 0;
        memo.add(new int[]{events[0][1],events[0][2]});
        int ans = 0;
        for(int i=0;i<events.length;i++){
            while(!memo.isEmpty() && memo.peek()[0]<events[i][0]){
                currMax = Math.max(currMax,memo.poll()[1]);
            }
            ans = Math.max(ans,currMax+events[i][2]);
            memo.add(new int[]{events[i][1],events[i][2]});
        }
        while(!memo.isEmpty()){
            ans = Math.max(ans,memo.poll()[1]);
        }
        return ans;
    }
}