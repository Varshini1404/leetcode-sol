class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        int count = 0;
        for(int i=0;i<dominoes.length;i++)
        {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            int key;
            if(a<=b)
            {
                key = a*10+b;
            }
            else{
                key = b*10+a;
                }
        
        if(hp.containsKey(key))
        {
            count+=hp.get(key);
            hp.put(key,hp.get(key)+1);
        }
        else{
            hp.put(key,1);
        }
        }
    return count;
    }
}