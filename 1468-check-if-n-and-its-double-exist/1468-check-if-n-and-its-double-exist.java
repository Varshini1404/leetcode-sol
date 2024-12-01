import java.util.Arrays;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int start = 0;         
            int end = arr.length - 1; 

            while (start <= end) {
                int mid = start + (end - start) / 2; 
                
               
                if (arr[mid] == 2 * arr[i] && mid != i) {
                    return true; 
                } 
                else if (arr[mid] > 2 * arr[i]) {
                    end = mid - 1;
                } 
                else {
                    start = mid + 1;
                }
            }
        }
        return false; 
    }
}