class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int negative = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] < 0){
                    negative++;
                }
                sum += Math.abs(matrix[i][j]);
                if(Math.abs(matrix[i][j])<min){
                    min = Math.abs(matrix[i][j]);
                }
            }
        }
        if(negative%2 == 0){
            return sum;
        }
        return sum-2*min;
    }
}