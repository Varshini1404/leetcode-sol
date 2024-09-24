class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //linear Search
      /*  for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;*/
        int row=matrix.length;
        int col=matrix[0].length;
        int l=0;
        int r=row*col-1;
       
        

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int me = matrix[mid / col][mid % col];

            if (me == target) {
                return true; 
            }
            if (target < me) {
                r = mid - 1; // Update r to search the left half
            } else {
                l = mid + 1; // Update l to search the right half
            }
        }
        return false; 

    }
}