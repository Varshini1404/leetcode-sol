class Solution {
    public void rotate(int[][] matrix) {
        int l=matrix.length;
        for(int i=0;i<l/2;i++)
        {
            for(int j=0;j<l;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[l-i-1][j];
                matrix[l-i-1][j]=temp;
            }   
        } 
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }    
    }
}