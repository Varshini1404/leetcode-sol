class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();  

        if (numRows == 0) {
            return res;
        }

        List<Integer> frow = new ArrayList<>();
        frow.add(1);
        res.add(frow);  

        if (numRows == 1) {
            return res;
        }

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = res.get(i - 1);  
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 0; j < prev.size() - 1; j++) {  // Fix 4: Correct loop range
                row.add(prev.get(j) + prev.get(j + 1));
            }

            row.add(1);
            res.add(row);
        }

        return res;
    }
}
