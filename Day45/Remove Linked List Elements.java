
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fast = head;
        ListNode slow = head;
        if(head==null)return null;
       
        while(fast.next!=null){
            fast=fast.next;
            if(fast.val != val){
                slow=slow.next;
            }
            else{
                slow.next=fast.next;
            }
        }
         if(head.val == val) head=head.next;
        return head;
    }
}