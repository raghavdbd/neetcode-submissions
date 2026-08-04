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
    public ListNode Reverse(ListNode head ){
        ListNode next=head;
        ListNode prev=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {

        ListNode l1=head;
        ListNode l2=head;

        while(l2.next!=null && l2.next.next!=null){
            l1=l1.next;
            l2=l2.next.next;
        }
        ListNode headA=head;
        ListNode headb=l1.next;
        l1.next=null;
        headb= Reverse(headb);
        ListNode next=null;
        while(headA !=null && headb !=null){
            next=headA.next;
            headA.next=headb;
            headA=headA.next;
            headb=headb.next;
            headA.next=next;
            headA=headA.next;



        }

        
        
    }
}
