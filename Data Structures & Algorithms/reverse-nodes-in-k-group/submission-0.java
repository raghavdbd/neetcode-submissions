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
    public ListNode kthnode(ListNode temp, int k){
        ListNode knode= temp;
    int count=1;
    while(count<k){
        if(knode==null){
            return null;
        }
        knode=knode.next;
        count++;
    }
    return knode;
    }
    public void reverse(ListNode temp){
        ListNode prev=null;
        ListNode next=temp;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp=head;
        ListNode next=null;
        ListNode prev=null;

        while(temp!=null){

            ListNode knode= kthnode(temp,k);


            if(knode==null){
             prev.next=next;
             return head;
          
               

            }else{

                next=knode.next;
                knode.next=null;

                reverse(temp);

                if(temp==head){
                    head=knode;
                }else{
                    prev.next=knode;


                    
                }
                prev=temp;
                    temp=next;


                


            }
        }

        return head;



        
    }
}
