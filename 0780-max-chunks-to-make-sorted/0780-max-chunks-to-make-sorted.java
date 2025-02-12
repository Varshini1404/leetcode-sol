class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        if(n==0) return 0;
        int maxSoFar=-1;
        int chunk=0;
        for(int i=0;i<arr.length;i++){
            maxSoFar=Math.max(maxSoFar,arr[i]);
            if(maxSoFar==i){
                chunk++;
            }
        }

        return chunk;
    }
}