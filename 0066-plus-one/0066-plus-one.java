class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;//sum = 0
        
        }
        int[] plus=new int[digits.length+1];
        plus[0]=1;
        return plus;


    }
}