class Solution {
    public int arrangeCoins(int n) {
        long coin = 0;
        int row = 0;

        while(coin+(row+1)<=n)
        {
            row++;
            coin+=row;
        }
        return row;
    }
}