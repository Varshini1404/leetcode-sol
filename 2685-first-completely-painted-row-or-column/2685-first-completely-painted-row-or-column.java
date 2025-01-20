class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        
        Map<Integer, int[]> lookup = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                lookup.put(mat[i][j], new int[]{i,j});
            }
        }

        int rowcount[]=new int[m];
        int colcount[]=new int[n];
        for(int i=0;i<arr.length;i++){
            int coordinate[]=lookup.get(arr[i]);
            int x=coordinate[0];
            int y=coordinate[1];
            rowcount[x]++;
            colcount[y]++;
            if(rowcount[x]==n || colcount[y]==m){
                return i;
            }
        }
        return 0;
        
    }
}