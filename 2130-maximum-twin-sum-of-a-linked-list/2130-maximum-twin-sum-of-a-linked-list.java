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
    public static ListNode middleofLinkedList(ListNode head){
        if(head==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
       return slow;
    }
    public static ListNode LinkedListreverse(ListNode head){
        if(head==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode currnxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currnxt;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode middle=middleofLinkedList(head);
        ListNode secondstart=LinkedListreverse(middle);
        int sum=0;
        ListNode temp=head;
        while(temp!=null && secondstart!=null){
            sum=Math.max(sum,temp.val+secondstart.val);
            temp=temp.next;
            secondstart=secondstart.next;
        }
        return sum;
    }
}