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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<1)return null;
        for(int i=1;i<lists.length;i++){
            lists[i]=ms(lists[i],lists[i-1]);

        }
        return lists[lists.length-1];



    }
    public ListNode ms(ListNode l1,ListNode l2){
        ListNode d=new ListNode();
        ListNode t=d;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                t.next=l1;
                l1=l1.next;
            }
            else{
            t.next=l2;
            l2=l2.next;
            }
            t=t.next;
        }
        if(l1!=null){
            t.next=l1;
        }
        if(l2!=null){
            t.next=l2;
        }
        return d.next;

    }
}
