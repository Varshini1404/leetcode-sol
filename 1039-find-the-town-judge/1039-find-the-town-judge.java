class Solution {
    public int findJudge(int n, int[][] trust) {
        int [][] result = new int[n+1][2];

        for(int i = 0; i<trust.length;i++){
            result[trust[i][0]][0]+=1;
            result[trust[i][1]][1]+=1;
        }
        if(n==1){
            return 1;
        }

        for(int i= 0;i<=n;i++){
            if(result[i][0]==0 && result[i][1]==n-1){
                return i;
            }
        }
        
        return -1;
    }
}