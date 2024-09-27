import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] count = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count[i]++;
                } else {
                    break;
                }
            }
        }

        Integer[] indices = new Integer[mat.length];
        for (int i = 0; i < mat.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> {
            if (count[a] != count[b]) {
                return count[a] - count[b];
            } else {
                return a - b; 
            }
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = indices[i];
        }

        return result;
    }
}