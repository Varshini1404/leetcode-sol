class Solution {
    public boolean judgeCircle(String moves) {
        int sum=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
                sum+=1;
            }
            else if(moves.charAt(i)=='D')
            {
                sum-=1;
            }
            else if(moves.charAt(i)=='L')
            {
                sum+=5;
            }
            else if(moves.charAt(i)=='R')
            {
                sum-=5;
            }
        }
        return sum == 0;

    }
}