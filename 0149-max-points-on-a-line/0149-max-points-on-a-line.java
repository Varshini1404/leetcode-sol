class Solution {

    public int maxPoints(int[][] points) {
        int max_count = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> count_map = new HashMap();
            for (int j = i + 1; j < points.length; j++) {
                int diff_x = points[j][0] - points[i][0];
                int diff_y = points[j][1] - points[i][1];

                int slope = 0; 
                if(diff_x == 0){   
                    slope = 10001; 
                }else{

                    slope = (diff_y * 10000) / diff_x;
                }
                int count = count_map.getOrDefault(slope, 0) + 1;
                count_map.put(slope, count);
                max_count = Math.max(max_count, count);
            }
        }
        return max_count + 1;
    }

}