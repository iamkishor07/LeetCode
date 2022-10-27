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
        if(head==null || head.next==null) return null;
        int len=0;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            prev=temp;
            temp=temp.next;
            len++;
        }
        
        if(len==n){
            head=head.next;
            return head;
        }
        ListNode start=head;
        int travel=len-n;
        while(travel-->1){
            start=start.next;
        }
        start.next=start.next.next;
        
        return head;
    }
}