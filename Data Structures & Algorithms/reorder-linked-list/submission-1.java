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
        ListNode mid=middle(head);
        ListNode rev=reverse(mid.next);
        mid.next=null;

        ListNode temp=head;
        ListNode temp2=rev;
        while(temp!=null && temp2!=null){
            ListNode next1=temp.next;
            temp.next=temp2;
            ListNode next2=temp2.next;
            temp2.next=next1;
            temp=next1;
            temp2=next2;
        }
        
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }

        public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
