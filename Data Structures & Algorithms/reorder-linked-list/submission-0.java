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
    public void reorderList(ListNode head) {
        
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
       
        ListNode p=null;
        while(s!=null){
            ListNode temp=s.next;
            s.next=p;
            p=s;
            s=temp;
        }
        f=head;
        while(p!=null&&f!=null){
            ListNode t=f.next;
            ListNode tt=p.next;
           
            f.next=p;
            p.next=t;
            f=t;
            p=tt;
        }
      
        

        
    }
}
