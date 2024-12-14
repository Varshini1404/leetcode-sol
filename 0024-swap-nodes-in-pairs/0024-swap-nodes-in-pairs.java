class Solution {
public ListNode swapPairs(ListNode head) {
if(head==null||head.next==null)
{
return head;
}
ListNode p=new ListNode(0);
p.next=head;
ListNode x=p;
while(x.next!=null && x.next.next!=null)
{
int temp=x.next.val;
x.next.val=x.next.next.val;
x.next.next.val=temp;
x=x.next.next;
}
return p.next;
}
}