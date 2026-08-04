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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode dummy= new ListNode(-1);
        ListNode head=dummy;
        int rem=0;

        while(l1!=null && l2!=null){
            int a=l1.val;
            int b=l2.val;
            int val=a+b+rem;
            dummy.next=new ListNode(val%10);
            rem= val/10;
            l1=l1.next;
            l2=l2.next;
            dummy=dummy.next;
            
        }
        if(l1==null && l2==null){
            if(rem>0){
                dummy.next=new ListNode(rem);

                

            }
        }
        if(l1!=null){
            while(l1!=null){
                int val= l1.val+rem;
                dummy.next=new ListNode(val%10);
                dummy=dummy.next;
                rem= val/10;
                l1=l1.next;

            }
            if(rem>0){
                dummy.next=new ListNode(rem);

                

            }
            
        }
        
        if(l2!=null){
            while(l2!=null){
                int val= l2.val+rem;
                dummy.next=new ListNode(val%10);
                dummy=dummy.next;
                rem= val/10;
                l2=l2.next;

            }
            if(rem>0){
                dummy.next=new ListNode(rem);

                

            }
            
        }
        return head.next;

        
    }
}
