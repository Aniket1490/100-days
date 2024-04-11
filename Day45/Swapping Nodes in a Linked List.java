
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode curr = head;
        int size=1;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        for(int i=1; i<k; i++){
            first=first.next;
        }
        int temp = first.val;
        for(int i=1; i<size-k; i++){
              second = second.next;
        }
        first.val=second.val;
        second.val=temp;
        return head;
    }
}