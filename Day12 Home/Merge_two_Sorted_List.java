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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      //  Using Extra Space by makine one another new Linked list
 
        // ListNode temp1 = list1;
        // ListNode temp2 = list2;
        // ListNode head = new ListNode(100);
        // ListNode temp = head;
        // while(temp1!=null && temp2!=null){
        //     if(temp1.val<temp2.val){
        //         ListNode a = new ListNode(temp1.val);
        //         temp.next=a;
        //         temp=a;
        //         temp1=temp1.next;
        //     }
        //     else{
        //         ListNode a = new ListNode(temp2.val);
        //         temp.next=a;
        //         temp=a;
        //         temp2=temp2.next;
        //     }
        // }
        // if(temp1==null){
        //     temp.next=temp2;
        // }
        // else{
        //     temp.next=temp1;
        // }


        //Without extra space by rearranging the element in the same

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp1;
                temp1=temp.next;
            }
            else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;
    }
}