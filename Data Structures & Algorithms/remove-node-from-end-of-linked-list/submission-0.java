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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d=new ListNode();
        d.next=head;
        ListNode t=d;
        ListNode s=d;
        while(n-->0){
            t=t.next;
           
        }
        while(t.next!=null){
            t=t.next;
            s=s.next;
        }
        s.next=s.next.next;
        return d.next;


    }
}
