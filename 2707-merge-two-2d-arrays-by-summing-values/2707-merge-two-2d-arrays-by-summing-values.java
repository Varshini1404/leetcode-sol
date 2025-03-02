class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n [] : nums1)
          map.put(n[0],n[1]);
        for(int n[]: nums2){
            map.put(n[0],map.getOrDefault(n[0],0)+n[1]);
        }
        int result[][] = new int[map.size()][2];
        int i = 0;
        for(int n : map.keySet()){
            result[i][0] = n;
            result[i][1] = map.get(n);
            i++;
        }
        Arrays.sort(result,(x,y)->Integer.compare(x[0],y[0]));
        return result;
    }
}