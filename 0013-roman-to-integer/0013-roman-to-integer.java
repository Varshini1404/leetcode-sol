class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hp = new HashMap<>();
        hp.put('I',1);
        hp.put('V',5);
        hp.put('X',10);
        hp.put('L',50);
        hp.put('C',100);
        hp.put('D',500);
        hp.put('M',1000);

        
        int pc = 0;
        int tot=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int cur = hp.get(s.charAt(i));
            if(pc>cur)
            {
                tot-=cur;
            }
            else {
                tot+=cur;
            }
            pc = cur;
        }
        return tot;
    }
}