import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        BigInteger n = BigInteger.ZERO;

        for(int i=0;i<num.length;i++)
        {
            n=n.multiply(BigInteger.TEN).add(BigInteger.valueOf(num[i]));//123
        }
         BigInteger sum = n.add(BigInteger.valueOf(k));
        List<Integer> res = new ArrayList<>();
        for(char c : String.valueOf(sum).toCharArray())
        {
            res.add(c-'0');
        }

        return res; 
    }
}