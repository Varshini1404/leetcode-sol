class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return arr;
        int test[] = arr.clone();
        Arrays.sort(test);
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int rank = 1;
        for(int a : test){
            if(!hmap.containsKey(a)){
                hmap.put(a,rank++);
            }
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = hmap.get(arr[i]);
        }

        return arr;
    }
}