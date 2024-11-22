class Solution {
public:
    void flipTheColumn(vector<vector<int>>& matrix, int col_index, int rows){
        for(int i = 0; i < rows; ++i){
            if(matrix[i][col_index]){
                matrix[i][col_index] = 0;
            }else{
                matrix[i][col_index] = 1;
            }
        }
    }

    int countEqualValuesRows(vector<vector<int>>& matrix, int rows, int cols){
        int count = 0;
        for(int i = 0; i < rows; ++i){
            int val = matrix[i][0];
            bool equal_values_row = true;
            for(int j = 0; j < cols; ++j){
                if(matrix[i][j] != val){//not equal values row
                    equal_values_row = false;
                    break;
                }
            }
            if(equal_values_row){
                ++count;
            }
        }
        return count;
    }

    int countWithithRow(vector<vector<int>> matrix, int r_index, int flipValue, int rows, int cols){
        for(int i = 0; i < cols; ++i){
            if(matrix[r_index][i] != flipValue){
                flipTheColumn(matrix, i, rows);
            }
        }
        return countEqualValuesRows(matrix, rows, cols);
    }
    int maxEqualRowsAfterFlips(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = matrix[0].size();
        int curr_max = -1;
        int count;
        for(int i = 0; i < rows; ++i){
            count = countWithithRow(matrix, i, 0, rows, cols);
            if(count > curr_max){
                curr_max = count;
            }
            count = countWithithRow(matrix, i, 1, rows, cols);
            if(count > curr_max){
                curr_max = count;
            }
        }
        return curr_max;
    }
};