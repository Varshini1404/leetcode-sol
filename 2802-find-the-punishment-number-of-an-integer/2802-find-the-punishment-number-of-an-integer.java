class Solution {
    public boolean isPossible(int squareNumber, int num, int div){
        int divResult  = (squareNumber/ div) ;
        int rem =  (squareNumber % div);
        int sum = divResult +rem ;
        if(sum == num){
            return true;
        } 
        if(divResult == 0){
            return false;
        }
        int reminderSum = num - divResult;

        return  isPossible(rem,reminderSum,1) || isPossible(squareNumber, num, div*10);
    } 
    public int punishmentNumber(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
             int square = i*i;
             boolean  isPossible = isPossible(square, i, 1);
             if(i == 36){
                System.out.println(square + " :: " + isPossible);
             }
             if( isPossible){
                System.out.println(i);
                sum += square;
             }
        }
        return sum;
    }
}