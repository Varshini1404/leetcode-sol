public class Solution {
    public int minSwaps(String s) {
        int imbalance = 0;  
        int balance = 0;  

        for (char c : s.toCharArray()) {
            if (c == '[') {
                balance++;  
            } else {
                balance--;  
            }

            if (balance < 0) {
                imbalance++; 
                balance = 0;  
            }
        }

        
        return (imbalance + 1) / 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

       
        System.out.println(solution.minSwaps("][]["));  
        System.out.println(solution.minSwaps("]]][[[")); 
        System.out.println(solution.minSwaps("[]"));    
    }
}