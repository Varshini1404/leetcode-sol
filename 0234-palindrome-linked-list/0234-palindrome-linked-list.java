/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       List<Integer> vals=new ArrayList<>();
       ListNode curr=head;
       while(curr!=null)
       {
        vals.add(curr.val);
        curr=curr.next;
       }
       int low=0;
       int high=vals.size()-1;

       while(low<high)
       {
               if(!vals.get(low).equals(vals.get(high))){
                return false;
            }
            low = low + 1;
            high = high - 1;
        }
       
       return true;





    }
}